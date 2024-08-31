package Uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc; // Objeto Scanner para entrada do usuário
	private Cofrinho cofrinho; // Objeto Cofrinho para armazenar as moedas
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void exibirMenuPrincipal () {
		boolean continuar = true; // Variável para controlar a execução do menu
		
		//Loop para exibir o menu até que o usuário decida encerrar
		while (continuar) { 
			System.out.println("COFRINHO");
			System.out.println("1-Adicionar moeda");
			System.out.println("2-Remover moeda");
			System.out.println("3-Listar moedas");
			System.out.println("4-Calcular valor total convertido para real");
			System.out.println("0-Encerrar");
	
			String opcaoSelecionada = sc.next(); // Obter a opção selecionada pelo usuário
			
			switch (opcaoSelecionada) {
				case "0":
					System.out.println("Sistema Finalizado");
					continuar = false;  // Encerra o loop
					break;
					
				case "1":
					adicionarMoeda();  // Chama o método para adicionar moeda
					break;
					
				case "2":
					removerMoeda();  // Chama o método para remover moeda
					break;
					
				case "3":
					listarMoedas();  // Chama o método para listar moedas
					break;
					
				case "4":
					calcularValorTotalConvertido();  // Chama o método para calcular o valor total convertido
					break;
					
					
				default:
					System.out.println("Opção inválida!");  // Mensagem de erro para opções inválidas
					break;
					
			}
		}
	}
	
	private void adicionarMoeda() {
		System.out.println("Escolha Moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro");
		
		int opcaoMoeda = sc.nextInt();  // Obter a opção de moeda selecionada pelo usuário
		
		
		System.out.println("Digite o valor:");
		
		String valorTextoMoeda = sc.next();
		valorTextoMoeda = valorTextoMoeda.replace(",", ".");  // Substitui ',' por '.' para lidar com valores decimais
		double valorMoeda = Double.parseDouble(valorTextoMoeda);
		
		Moeda moeda = criarMoeda(opcaoMoeda, valorMoeda);  
		
		if (moeda != null) {
			cofrinho.adicionar(moeda);  // Adiciona a moeda ao cofrinho
			System.out.println("Moeda adicionada!");
		} else {
			System.out.println("Não existe essa moeda!");  // Mensagem de erro para opções de moeda inválidas
		}
		
      }
	
	
	private void removerMoeda() {
		System.out.println("Escolha Moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dólar");
		System.out.println("3 - Euro");
		
		int opcaoMoeda = sc.nextInt();  //Obter a opção de moeda selecionada pelo usuário
		
		System.out.println("Digite o valor:");
		
		String valorTextoMoeda = sc.next();
		valorTextoMoeda = valorTextoMoeda.replace(",", ".");  // Substitui ',' por '.' para lidar com valores decimais
		double valorMoeda = Double.parseDouble(valorTextoMoeda); 
	
		
		Moeda moeda = criarMoeda(opcaoMoeda, valorMoeda);
		
		boolean removeuMoeda = cofrinho.remover(moeda);  // Remove a moeda do cofrinho e verifica se foi removida
         
		if (removeuMoeda) {
			System.out.println("Moeda removida com sucesso!"); // Mensagem de sucesso ao remover a moeda
		} else {
			System.out.println("Não foi encontrada nenhuma moeda com esse valor!");  // Mensagem de erro se a moeda não foi encontrada
		}
	}
	
	
	private void listarMoedas() {
		cofrinho.ListarMoedas();
	}
	
	private void calcularValorTotalConvertido() {  // Calcula o valor total convertido
		double valorTotalConvertido = cofrinho.totalConvertido();
		String valorTotalConvertidoTexto = String.format("%.2f", valorTotalConvertido);  // Formata o valor para duas casas decimais
		valorTotalConvertidoTexto = valorTotalConvertidoTexto.replace(".", ",");  // Substitui '.' por ','
		System.out.println("O valor total convertido para real é: " + valorTotalConvertidoTexto); // Exibe
	}
	
	private Moeda criarMoeda(int opcaoMoeda, double valorMoeda) {
		switch (opcaoMoeda) {
			case 1:
				return new Real(valorMoeda);
			case 2:
				return new Dolar(valorMoeda);
			case 3:
				return new Euro(valorMoeda);
			default:
				return null;
		}
	}
}
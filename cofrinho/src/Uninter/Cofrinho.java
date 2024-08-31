package Uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas ;  // ArrayList para armazenar as moedas
	
	public Cofrinho() {
	    this.listaMoedas = new ArrayList <> ();
	    
	}
	// Método para adicionar uma moeda ao cofrinho
	    	public void adicionar(Moeda moeda) {
	    		this.listaMoedas.add(moeda); // Adiciona a moeda à lista
	    		
	    	} 
	    	// Método para remover uma moeda do cofrinho
	    	public boolean remover(Moeda moeda) {
	    		return this.listaMoedas.remove(moeda); // Remove a moeda da lista e retorna  removida com sucesso
	    		
	    	}
	    	//Método para listar as moedas presentes no cofrinho
    public void ListarMoedas() {
    	
    	if (this.listaMoedas.isEmpty()) { // Verifica se a lista de moedas está vazia
    		System.out.println("Não existe nenhuma moeda no cofrinho !"); // Se estiver vazia, exibe essa mensagem
    		return;
    	
    		
    	}

         for (Moeda moeda : this.listaMoedas) {  // Percorre a lista de moedas
        	 moeda.info();
        }
    }
 // Método para calcular o valor total convertido das moedas no cofrinho
	public double totalConvertido() {
		
		if (this.listaMoedas.isEmpty()) {  // Verifica se o cofrinho está vazio
			return 0;  // Retorna 0 se estiver vazio
			
		}
	      
		if (this.listaMoedas.size() ==1) {  // Verifica se há apenas uma moeda no cofrinho
			return 1;
			
		}
		
		double valorAcumulado = 0;  // Variável para acumular o valor total convertido
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();   // Acumula o valor convertido de cada moeda
		}
		
		return valorAcumulado;  // Retorna o valor total convertido
	
		
	}
    
	
	
  }

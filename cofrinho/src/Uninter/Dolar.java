package Uninter;

public class Dolar extends Moeda {
	

	// Construtor da classe Dolar que recebe o valor inicial da moeda
	public Dolar( double valorInicial) {
	    this.valor = valorInicial;  // Inicializa o valor da moeda com o valor passado
	}
	
	
	@Override
	public void info () {
		System.out.println("Dolar - "+ valor);  // Exibe o tipo da moeda (Dolar) e seu valor
		
	}

	@Override
	public double converter() {
		return this.valor* 5.1;  // Converte o valor da moeda para real usando a cotação do dólar
		
	}

	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
		   return false;
		
     }
	    
		Dolar objetoDeDolar = (Dolar) objeto;
		
		
		if(this.valor != objetoDeDolar.valor) {
			return false;
				
		}
		
	     return true; 
	
	}
	
	
}

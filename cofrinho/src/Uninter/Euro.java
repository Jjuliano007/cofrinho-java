package Uninter;

public class Euro extends Moeda {
	

	// Construtor da classe Euro que recebe o valor inicial da moeda
	public Euro( double valorInicial) {
	    this.valor = valorInicial;
	}
	
	
	@Override
	public void info () {
		System.out.println("Euro - "+ valor);  // Exibe o tipo da moeda (Euro) e seu valor
		
	}

	@Override
	public double converter() {
		return this.valor* 5.5;  // Retorna o valor da moeda convertido para real
		
	}

	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
		   return false;
		
     }
	    
		Euro objetoDeEuro = (Euro) objeto;
		
		
		if(this.valor != objetoDeEuro.valor) {
			return false;
				
		}
		
	     return true; 
	
	}
	
	
}

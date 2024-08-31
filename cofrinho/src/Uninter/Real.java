package Uninter;

public class Real extends Moeda {
	
	// Construtor da classe Real que recebe o valor inicial da moeda
	public Real(double valorInicial) {
		this.valor = valorInicial; 
	}
	

	@Override
	public void info() {
	    System.out.println("Real - " + valor); // Exibe o tipo da moeda (Real) e seu valor
	}

	
	@Override
	public double converter() {
		return this.valor; 
	}

	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) { 
		   return false; // 
		}
	    
		Real objetoDeReal = (Real) objeto; 
		
		if (this.valor != objetoDeReal.valor) { 
			return false; 
		}
		
	     return true; 
     }
 }


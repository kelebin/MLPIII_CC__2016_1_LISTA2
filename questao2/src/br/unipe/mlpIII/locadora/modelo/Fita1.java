package br.unipe.mlpIII.locadora.modelo;

public class Fita1 extends Fita{
	
	public Fita1(String titulo,double price,Categoria categoria,Autor autor) {
		super(titulo,price,categoria,autor);
		
	}
	public void calcularP() {
		price+=(0.20*price);
	}
 
}
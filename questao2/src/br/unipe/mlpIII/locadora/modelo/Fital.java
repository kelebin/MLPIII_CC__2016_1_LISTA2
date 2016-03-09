package br.unipe.mlpIII.locadora.modelo;

public class Fital extends Fita{
	public Fital(String titulo,double price,Categoria categoria,Autor autor) {
		super(titulo,price,categoria,autor);
	}
	public void calcularP() {
		price-=(0.40*price);
	}
	
}
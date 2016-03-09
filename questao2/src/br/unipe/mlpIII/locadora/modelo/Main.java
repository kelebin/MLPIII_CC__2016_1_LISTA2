package br.unipe.mlpIII.locadora.modelo;

import br.unipe.mlpIII.locadora.modelo.Autor;
import br.unipe.mlpIII.locadora.modelo.Categoria;
import br.unipe.mlpIII.locadora.modelo.Fita;
import br.unipe.mlpIII.locadora.modelo.Fita1;

public class Main {

	public static void main(String[] args) {
		Autor autor=new Autor("James Cameron");
		Fita avatar=new Fita1("King Kong",10.0,Categoria.Acao,autor);
		
		avatar.calcularP();
		
		System.out.println(avatar);

	}

}
package br.unipe.mlpIII.data.modelo;


import java.util.Scanner;

import br.unipe.mlpIII.data.modelo.DataValidacao;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Verifique a data");
		System.out.println();
		System.out.print("Dia: ");
		String dia = scan.nextLine();
		System.out.print("Mês: ");
		String mes = scan.nextLine();
		System.out.print("Ano: ");
		String ano = scan.nextLine();		
		System.out.println(new DataValidacao(dia, mes, ano).toString());		
		scan.close();
	}
}
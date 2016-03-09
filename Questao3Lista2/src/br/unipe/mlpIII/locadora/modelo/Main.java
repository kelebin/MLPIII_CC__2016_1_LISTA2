package br.unipe.mlpIII.locadora.modelo;

import br.unipe.mlpIII.locadora.modelo.VeiculoDeCarga;
import br.unipe.mlpIII.locadora.modelo.VeiculoDePasseio;

public class Main {


	public static void main(String[] args) {
	
		
		VeiculoDeCarga v1 = new VeiculoDeCarga("JKM-3344", "Range Rover", "2015", 2014, 50.50, 5000, 5520, 1000000);
		VeiculoDePasseio v2 = new VeiculoDePasseio("JPL-1122", "Amarok", "2012", 2012, 10.00, 20000, 22000, true, 4);
		
		System.out.println("Km inicial : " + v1.getKmInicial() + " KM final :" + v1.getKmFinal() + " deu quanto?");
		System.out.println("Preco: R$ " + v1.getValorKmRodado() + " pra voc� sair nessa " + v1.getMarca() + " que suporta " + v1.getCapacidadeDeCarga() + " Kg" + ", ent�o vai custar R$ " + v1.calcularLocacao());
		System.out.println("");
		System.out.println("Motorista Andou do KM " + v2.getKmInicial() + " at� o KM " + v2.getKmFinal() + " pre�o?");
		System.out.println("O pre�o eh : " + v2.getValorKmRodado() + " pra voc� sair nessa " + v2.getMarca() + ", ent�o vai custar R$ " + v2.calcularLocacao());

	}

}
package com.foursys;

import java.util.Scanner;

public class FabricaRefri {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double lata, minigarrafa, garrafa, total;

		System.out.println("Informe a quantidade de ladas de 350 ml que voc� comprou: ");
		lata = ler.nextDouble();
		System.out.println("Informe a quantidade de garrafas de 600 ml que voc� comprou: ");
		minigarrafa = ler.nextDouble();
		System.out.println("Informe a quantidade de garrafas de 2 litros que voc� comprou: ");
		garrafa = ler.nextDouble();

		total = (lata * 0.35) + (minigarrafa * 0.60) + (garrafa * 2);

		System.out.println("Voc� comprou o total de: " + total + " litros de refrigerante. ");

		ler.close();

	}

}

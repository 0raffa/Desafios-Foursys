package com.foursys;

import java.util.Scanner;

public class Poupanca {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double cinco, dez, vintecinco, cinquenta, um, total;

		System.out.println("Informe a quantidade de moedas de 5 centavos:");
		cinco = leia.nextDouble();
		System.out.println("Informe a quantidade de moedas de 10 centavos:");
		dez = leia.nextDouble();
		System.out.println("Informe a quantidade de moedas de 25 centavos:");
		vintecinco = leia.nextDouble();
		System.out.println("Informe a quantidade de moedas de 50 centavos:");
		cinquenta = leia.nextDouble();
		System.out.println("Informe a quantidade de moedas de 1 real:");
		um = leia.nextDouble();

		total = (cinco * 0.05) + (dez * 0.10) + (vintecinco * 0.25) + (cinquenta * 0.5) + (um * 1);

		System.out.println("Seu total economizado é: "  +total + " reais");

	}

}

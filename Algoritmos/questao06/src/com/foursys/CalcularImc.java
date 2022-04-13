package com.foursys;

import java.util.Scanner;

public class CalcularImc {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double peso, altura, imc;

		System.out.println("Informe o seu peso ");
		peso = leia.nextDouble();

		System.out.println("Informe  sua altura");
		altura = leia.nextDouble();

		imc = peso / Math.pow(altura, 2);

		System.out.println("O seu IMC é:" + imc);

		leia.close();
	}

}
package com.foursys;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double a, b;

		System.out.println("Descubra qual é o maior valor \n");

		System.out.println("Informe o primeiro valor:");
		a = ler.nextDouble();
		System.out.println("Informe o segundo valor:");
		b = ler.nextDouble();

		if (a > b) {
			System.out.println("O primeiro valor é o maior");
		} else if (a < b) {
			System.out.println("O segundo valor é o maior");
		} else {
			System.out.println("Os numeros são iguais ");
		}

		ler.close();

	}

}

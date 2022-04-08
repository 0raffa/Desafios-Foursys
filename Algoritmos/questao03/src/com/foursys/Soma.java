package com.foursys;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		int num1, num2, soma;

		Scanner l = new Scanner(System.in);

		System.out.println("Informe o primeiro número inteiro: ");
		num1 = l.nextInt();

		System.out.println("Informe o segundo número inteiro: ");
		num2 = l.nextInt();

		soma = num1 + num2;

		System.out.println("A soma de " + num1 + " + " + num2 + " é: " + soma);

		l.close();

	}

}

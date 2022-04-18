package com.foursys;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);

		double altura, peso, imc;

		System.out.println(". Calcule o IMC e informe se ele está dentro do intervalo de 18,5 e 25 \n");

		System.out.println("Informe a sua altura (ex: 1,65): ");
		altura = l.nextDouble();

		System.out.println("Informe o seu peso (ex: 80.5) ");
		peso = l.nextDouble();

		imc = peso / (altura * 2);

		if (imc >= 18.5 && imc <= 25) {
			System.out.println("O seu IMC está dentro do intervalo de 18,5 e 25");
		} else {
			System.out.println("o seu IMC não está dentro do intervalo de 18,5 e 25");
		}
		
		l.close();

	}
}

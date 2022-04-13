package com.foursys;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {

		Scanner l = new Scanner(System.in);

		double altura, peso;
		String sexo;

		System.out.println("Peso ideal \n");

		System.out.println("Informe a sua altura (ex: 1,65): ");
		altura = l.nextDouble();

		System.out.println("Informe o seu sexo, M para masculino e F para feminino: ");
		sexo = l.nextLine();

		if (sexo == "M") {
			peso = (72.7 * altura) - 58;
			System.out.println("O seu peso ideal é: " + peso);
		} else {
			peso = (62.1 * altura) - 44.7;
			System.out.println("O seu peso ideal é: " + peso);

		}

		l.close();

	}

}

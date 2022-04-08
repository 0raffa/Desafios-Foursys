package com.foursys;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double precoUnitario = 1.99, desc = 0.05, total;
		int unidades;

		System.out.println("Informe a quantidade de itens comprados: ");
		unidades = leia.nextInt();

		total = (precoUnitario * unidades) - (precoUnitario * unidades * desc);

		System.out.println("Total a apagar com descondo de 5% é : " + total + " reais.");

		leia.close();
	}

}

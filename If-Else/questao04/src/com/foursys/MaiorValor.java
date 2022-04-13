package com.foursys;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {


		Scanner l = new Scanner(System.in);
		
		double a,b,c, total;
		
		System.out.println("Informe o valor de A: ");
		a = l.nextDouble();
		System.out.println("Informe o valor de B: ");
		b = l.nextDouble();
		System.out.println("Informe o valor de C: ");
		c = l.nextDouble();
		
		total = a+b;
		
		if(total > c) {
		   System.out.println(" O valor de A + B é maior que o valor de C: ");
		}
		else {
			System.out.println("O valor de A + B é menor que o valor de C: ");
		}
		
		
		l.close();
		

	}

}

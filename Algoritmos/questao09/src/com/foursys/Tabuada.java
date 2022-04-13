package com.foursys;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int num, total;
		
		System.out.println("Informe o numero em que deseja saber a tabuada dele: ");
		num = leia.nextInt();
		
		for(int i = 0 ; i<=10; i++) {
			
			System.out.println(num +" * " + i + " = " +  (num * i) );
			
			leia.close();
		}
	}

}

package com.fousys;

import java.util.Scanner;

public class CalcularRetangulo {

	public static void main(String[] args) {
		
		int b, h, area;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Infome o lado B do ret�ngulo: ");
		b = ler.nextInt();
	 
	System.out.println("Infome o lado H do ret�ngulo: ");
		h = ler.nextInt();
		
		area = b*h;
				
		System.out.println("A �rea do ret�ngulo �:  " + area);
		
		ler.close();	
	}

}

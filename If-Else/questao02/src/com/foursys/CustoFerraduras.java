package com.foursys;

import java.util.Scanner;

public class CustoFerraduras {

	public static void main(String[] args) {

		Scanner l = new Scanner(System.in);
		
		int quant;
		double valor = 9.90, total, desc = 0.10;
		
		System.out.println("Informe a quantidade de cavalos que precisam de (4) ferraduras: ");
		quant = l.nextInt();
		
		total = quant*valor*4;
		
		if(total > 100.00) {
			total = total - total*desc;	
			System.out.println("Você recebeu 10% de desconto! O custo total é de: " + total + " reais.");
		}
		else {
			System.out.println("O custo total é de: " + total + " reais.");
		}
		
		
        l.close();
	}

}

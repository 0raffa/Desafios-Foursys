package com.foursys;

import java.util.Scanner;

public class CreditoVista {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tipo;
		double credito = 0.05, debito = 0.10 , total;
	
		
		System.out.println("Informe o total da compra");
		total = leia.nextDouble();
		System.out.println("Qual o tipo de pagamento; digite 1 para débito ou 2 para crédito");
		tipo = leia.nextInt();
		
		if(tipo  == 1 ) {
			total = total - total * debito;
			System.out.println("Você obteve desconto de 10%!, sua compra ficou em " + total + " reais.");
		}
		else {
			total = total - total * credito;
		     System.out.println("Você obteve desconto de 5%!, sua compra ficou em " + total + " reais.");
		}
		
		
		leia.close();
	}

}

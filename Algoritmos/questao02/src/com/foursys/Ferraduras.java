package com.foursys;

import java.util.Scanner;

public class Ferraduras {

	public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);
       
      int  cav;
      double  preco = 9.90, total;
		System.out.println("Infome a quantidade de cavalos que necessitam trocar as ferraduras: ");
			cav = leia.nextInt();
		
			total = (cav*4)*preco;
			
			System.out.println("O custo total é de: " + total +" reais");
		

	}

}

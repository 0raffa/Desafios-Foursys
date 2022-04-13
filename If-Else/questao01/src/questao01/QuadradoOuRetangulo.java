package questao01;

import java.util.Scanner;

public class QuadradoOuRetangulo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int b, h, area;

		System.out.println("Descubra se quadrado ou retângulo\n");

		System.out.println("Insira o valor da base: ");
		b = ler.nextInt();

		System.out.println("Insira o valor da altura: ");
		h = ler.nextInt();

		area = b * h;

		if (b == h) {
			System.out.println("É um quadrado, e a área calculada é: " + area);
		}
		else {
			System.out.println("Não é um quadrado, é um retângulo! e a área calculada é: " + area);
			
			ler.close();
		}
	}
}

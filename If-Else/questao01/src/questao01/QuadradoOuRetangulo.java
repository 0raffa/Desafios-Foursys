package questao01;

import java.util.Scanner;

public class QuadradoOuRetangulo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int b, h, area;

		System.out.println("Descubra se quadrado ou ret�ngulo\n");

		System.out.println("Insira o valor da base: ");
		b = ler.nextInt();

		System.out.println("Insira o valor da altura: ");
		h = ler.nextInt();

		area = b * h;

		if (b == h) {
			System.out.println("� um quadrado, e a �rea calculada �: " + area);
		}
		else {
			System.out.println("N�o � um quadrado, � um ret�ngulo! e a �rea calculada �: " + area);
			
			ler.close();
		}
	}
}

package questao04;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		int a, b, c, media;

		Scanner l = new Scanner(System.in);

		System.out.println("Informe o primeiro valor:");
		a = l.nextInt();
		System.out.println("Informe o segundo valor:");
		b = l.nextInt();
		System.out.println("Informe o terceiro valor:");
		c = l.nextInt();
		media = (a + b + c) / 3;

		System.out.println("A média é: " + media);
		l.close();

	}

}

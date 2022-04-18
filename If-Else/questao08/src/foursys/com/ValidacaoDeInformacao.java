package foursys.com;

import java.util.Scanner;

public class ValidacaoDeInformacao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome, email;
		int cpf,rg;
		

		System.out.println("Solicite o nome, e-mail, rg e cpf da pessoa. Faça uma validação simples para verificar se todos os campos foram preenchidos\n");
		
		System.out.println("Informe o seu nome:");
		nome =  ler.next();
		
		System.out.println("Infome o seu e-mail: ");
		email = ler.next();
		
		System.out.println("Informe o seu CPF:");
		cpf = ler.nextInt();
		
		System.out.println("Informe o seu RG:");
		rg = ler.nextInt();
		
		
		if (nome != "" && email != "" && cpf != 0&& rg !=0){
			System.out.println("Todas as informações estão corretas");
		}
		else{
			System.out.println("Algum campo esta imcompleto:");
			
		}
	}

}

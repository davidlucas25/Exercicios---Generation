package exercicios;

import java.util.Scanner;

public class lacoDecisao3 {
	
	public static void maind(String[] args)
	{
		int idade;
		
		System.out.println("\nDigite sua idade: ");
		
		Scanner leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		if(idade < 10) {
			System.out.println("\nCategoria não identificada, criança muito nova.");
		}
		else if(idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria Infantil.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria Juvenil.");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("\nCategoria Adulta.");
		}
		else {
			System.out.println("\nCategoria não identificada, adulto muito velho.");
		}
	}
}

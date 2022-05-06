package exercicios;

import java.util.Scanner;

public class lacoDecisao1 {
	
	public static void main(String[] args)
	{
	
		int a1, a2, a3, maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite 3 números inteiros: ");
		a1 = leia.nextInt();
		a2 = leia.nextInt();
		a3 = leia.nextInt();
		
		maior = a1;
		
		if (a2 > maior) {
			maior = a2;
		} if (a3 > maior) {
			maior = a3;
		}
		
		System.out.println("\nO maior número digitado é: "+ maior);
	}
	
}

package exercicios;

import java.util.Scanner;

public class lacoDecisao2 {
	
	public static void main(String[] args)
	{
		float a1, a2, a3, menor, medio, maior;
		
		System.out.println("\nDigite três números: ");
		
		Scanner leia = new Scanner(System.in);
		a1 = leia.nextFloat();
		a2 = leia.nextFloat();
		a3 = leia.nextFloat();
		
		if(a1 <= a2) {
			if(a2 <= a3) {
				System.out.println("\nEis os números em ordem crescente: "+a1+", "+a2+", "+a3);
			}
			else if(a3 <= a1) {
				System.out.println("\nEis os números em ordem crescente: "+a3+", "+a1+", "+a2);
			}
			else {
				System.out.println("\nEis os números em ordem crescente: "+a1+", "+a3+","+a2);
			}
		}
		else {
			if(a3 > a1) {
				System.out.println("\nEis os números em ordem crescente: "+a2+", "+a1+", "+a3);
			}
			else if(a3 < a2) {
				System.out.println("\nEis os números em ordem crescente: "+a3+", "+a2+","+a1);
			}
			else {
				System.out.println("\nEis os números em ordem crescente: "+a2+", "+a3+", "+a1);
			}
		}
		
		
	}

}

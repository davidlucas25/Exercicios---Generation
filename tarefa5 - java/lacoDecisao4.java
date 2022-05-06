package exercicios;

import java.util.Scanner;

public class lacoDecisao4 {
	
	public static void main(String[] args) {
		
		double num, n1;
		
		System.out.println("\nDigite um número: ");
		Scanner leia = new Scanner(System.in);
		num = leia.nextFloat();
		
		if(num % 2 == 0) {
			n1 = (float) Math.sqrt(num);
			System.out.printf("\nEste número é par, e sua raiz quadrada é: %2.2f",n1);
		} else {
			n1 = Math.pow(num, 3);
			System.out.println("\nEste número é ímpar e o cubo deste número é: "+n1);
		}
	}
}

package exercicios;

import java.util.Scanner;

public class lacoDecisao4 {
	
	public static void main(String[] args) {
		
		double num, n1;
		
		System.out.println("\nDigite um n�mero: ");
		Scanner leia = new Scanner(System.in);
		num = leia.nextFloat();
		
		if(num % 2 == 0) {
			n1 = (float) Math.sqrt(num);
			System.out.printf("\nEste n�mero � par, e sua raiz quadrada �: %2.2f",n1);
		} else {
			n1 = Math.pow(num, 3);
			System.out.println("\nEste n�mero � �mpar e o cubo deste n�mero �: "+n1);
		}
	}
}

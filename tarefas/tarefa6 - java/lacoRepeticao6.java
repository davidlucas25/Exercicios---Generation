package exercicios;

import java.util.Scanner;

public class lacoRepeticao6 {
	
	public static void main(String[] args) {
		
		int Num, somaMult = 0, mediaMult, quantMult = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um n�mero inteiro: ");
		Num = leia.nextInt();
		
		do {
			if(Num % 3 == 0) {
				somaMult += Num;
				quantMult++;
			}
			System.out.println("\nDigite um n�mero inteiro: ");
			Num = leia.nextInt();
		}while(Num != 0);
		
		if(quantMult == 0) {
			System.out.println("\nN�o foi digitaos m�ltimos de 3.");
		} else {
			mediaMult = somaMult / quantMult;
			System.out.println("\nA m�dia dos m�ltiplos de 3 digitados �: "+mediaMult);
		}
	}
}

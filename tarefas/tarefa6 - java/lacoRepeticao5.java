package exercicios;

import java.util.Scanner;

public class lacoRepeticao5 {
	
	public static void main(String[] args) {
		
		int somaNum = 0, Num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número inteiro: ");
		Num = leia.nextInt();
		
		do {
			somaNum += Num;
			System.out.println("\nEntre com um número inteiro: ");
			Num = leia.nextInt();
		} while(Num != 0);
		
		System.out.println("\nA soma dos números digitados é de: "+somaNum);
	}
}

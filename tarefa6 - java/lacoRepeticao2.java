package exercicios;

import java.util.Scanner;

public class lacoRepeticao2 {
	
	public static void main(String[] args) {
		
		int quantPar = 0, quantImpar = 0, num;
		Scanner ler = new Scanner(System.in);
		
		for(int x = 0; x < 10; x++)
		{
			System.out.println("\nEntre com um número inteiro: ");
			num = ler.nextInt();
			
			if(num % 2 == 0)
			{
				quantPar++;
			} else {
				quantImpar++;
			}
		}
		System.out.println("\nA quantidade de valores pares é: "+quantPar+". E a quantidade de valores ímpares é: "+quantImpar);
	}

}

package exercicios;

import java.util.Scanner;

	/*- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.
	*/

public class vetor2 {

	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int quantImpar = 0, somaPar = 0, x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x < 6; x++)
		{
			System.out.println("\nDigite um número: ");
			numeros[x] = leia.nextInt();
		}
		
		System.out.println("\nNúmeros pares digitados: ");
		for(x = 0; x < 6; x++)
		{
			if(numeros[x] % 2 == 0) {
				System.out.println("\n"+numeros[x]);
				somaPar += numeros[x];
			}
		}
		System.out.println("\nA soma dos números pares digitados é: "+somaPar);
		System.out.println("\n\nNúmeros ímpares digitados: ");
		for(x = 0; x < 6; x++)
		{
			if(numeros[x] % 2 != 0) {
				System.out.println("\n"+numeros[x]);
				quantImpar++;
			}
		}
		System.out.println("\nA quantidade de números ímpares digitados é: "+quantImpar);
		
	}

}

package exercicios;

import java.util.Scanner;

	/*- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.
	*/

public class vetor2 {

	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		int quantImpar = 0, somaPar = 0, x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x < 6; x++)
		{
			System.out.println("\nDigite um n�mero: ");
			numeros[x] = leia.nextInt();
		}
		
		System.out.println("\nN�meros pares digitados: ");
		for(x = 0; x < 6; x++)
		{
			if(numeros[x] % 2 == 0) {
				System.out.println("\n"+numeros[x]);
				somaPar += numeros[x];
			}
		}
		System.out.println("\nA soma dos n�meros pares digitados �: "+somaPar);
		System.out.println("\n\nN�meros �mpares digitados: ");
		for(x = 0; x < 6; x++)
		{
			if(numeros[x] % 2 != 0) {
				System.out.println("\n"+numeros[x]);
				quantImpar++;
			}
		}
		System.out.println("\nA quantidade de n�meros �mpares digitados �: "+quantImpar);
		
	}

}

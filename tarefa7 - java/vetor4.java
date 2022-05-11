package exercicios;

import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/

public class vetor4 {

	public static void main(String[] args) {
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		
		int i, j, menu, K;
		
		Scanner leia = new Scanner(System.in);
		
		for(i = 0; i < 2; i++)
		{
			for(j = 0; j < 2; j++)
			{
				System.out.println("\nDigite o valor da linha "+(i+1)+" e coluna "+(j+1)+" da matriz 1.");
				matriz1[i][j] = leia.nextFloat();
				System.out.println("\nDigite o valor da linha "+(i+1)+" e coluna "+(j+1)+" da matriz 2.");
				matriz2[i][j] = leia.nextFloat();
			}
		}
		do
		{
			System.out.println("\nO que você deseja fazer: ");
			System.out.println("\n1 - Somar as duas matrizes; \n2 - Subtrair a primeira matriz da segunda;");
			System.out.println("\n3 - Adicionar uma constante a ambas as matrizes;");
			System.out.println("\n4 - Imprimir as duas matrizes.");
			System.out.println("\n0 - Sair do programa.");
			System.out.println("\nDigite a opção desejada: ");
			
			menu = leia.nextInt();
			
			switch(menu) {
			case 1:
				for(i = 0; i < 2; i++) {
					for(j = 0; j < 2; j++) {
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nMatriz 3 ["+(i+1)+"]["+(j+1)+"]: "+matriz3[i][j]);
					}
				}
				
			break;
			
			case 2:
				for(i = 0; i < 2; i++) {
					for(j = 0; j < 2; j++) {
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\nMatriz 3 ["+(i+1)+"]["+(j+1)+"]: "+matriz3[i][j]);
					}
				}
			break;
			
			case 3:
				System.out.println("\nDigite uma constante K: ");
				K = leia.nextInt();
				for(i = 0; i < 2; i++) {
					for(j = 0; j < 2; j++) {
						matriz2[i][j] += K;
						matriz1[i][j] += K;
						System.out.println("\nMatriz 1 ["+(i+1)+"]["+(j+1)+"]: "+matriz1[i][j]);
						System.out.println("\nMatriz 2 ["+(i+1)+"]["+(j+1)+"]: "+matriz2[i][j]);
					}
				}
			break;
				
			case 4:
				for(i = 0; i < 2; i++) {
					for(j = 0; j < 2; j++) {
						System.out.println("\nMatriz 1 ["+(i+1)+"]["+(j+1)+"]: "+matriz1[i][j]);
						System.out.println("\nMatriz 2 ["+(i+1)+"]["+(j+1)+"]: "+matriz2[i][j]);
					}
				}
			case 0:
				System.out.println("\nObrigado por utilizar o programa.");
				menu = 0;
				
			break;
			
			default:
				System.out.println("\nOpção inválida!!!");
			}
			
		}while(menu != 0);

	}

}

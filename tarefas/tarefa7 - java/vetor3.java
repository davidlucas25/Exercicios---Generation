package exercicios;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
import java.util.Scanner;

public class vetor3 {

	public static void main(String[] args) {

		float[][] matriz = new float[3][3];
		int linha, coluna, maior10 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nDigite o valor da linha "+(linha+1)+" e coluna "+(coluna+1)+": ");
				matriz[linha][coluna] = leia.nextFloat();
				
				if(matriz[linha][coluna] > 10) {
					maior10++;
				}
			}
		}
		System.out.println("\nA matriz possui "+maior10+" valor(es) maior(es) que 10.");
	}

}

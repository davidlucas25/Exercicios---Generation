package exercicios;

import java.util.Scanner;

public class lacoRepeticao3 {
	
	public static void main(String[] args) {
		
		int idade, menor21 = 0, mais50 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com uma idade: ");
		idade = leia.nextInt();
		
		while(idade != - 99)
		{
			if(idade < 21)
			{
				menor21++;
			} else if(idade > 50) {
				mais50++;
			}
			System.out.println("\nEntre com uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nA quantidade de pessoas com menos de 21 anos são: "+menor21);
		System.out.println("\nA quantidade de pessoas com mais de 50 anos são: "+mais50);
	}

}

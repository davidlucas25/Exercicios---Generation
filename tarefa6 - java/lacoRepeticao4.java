package exercicios;

import java.util.Scanner;

public class lacoRepeticao4 {

	public static void main(String[] args) {
		
	int idade, sexo, emocional, pessoa = 1, quantCalma = 0, femaleAngry = 0, maleAngry = 0, outrosCalmo = 0, nervosa40 = 0, calma18 = 0;
	Scanner leia = new Scanner(System.in);
	
	while(pessoa <= 150)
	{
		System.out.println("\nEntre com a sua idade: ");
		idade= leia.nextInt();
		System.out.println("\nEntre com 1 se você do sexo masculino, 2 se você é do sexo feminino, e 3 para outros.");
		sexo = leia.nextInt();
		System.out.println("\nEntre com 1 se você é calmo(a), 2 se você é nervoso(a) e 3 se você é agressivo(a).");
		emocional = leia.nextInt();
		
		if(emocional == 1) {
			quantCalma++;
		}
		
		if(sexo == 2 && emocional == 2) {
			femaleAngry++;
		} else if(sexo == 1 && emocional == 3) {
			maleAngry++;
		} else if(sexo == 3 && emocional == 1) {
			outrosCalmo++;
		}
		
		if(emocional == 2 && idade >= 40) {
			nervosa40++;
		} else if(emocional == 1 && idade < 18) {
			calma18++;
		}
		
		pessoa++;
	}
	
	System.out.println("\nO número de pessoas calmas é: "+quantCalma);
	System.out.println("\nO número de mulheres nervosas é: "+femaleAngry);
	System.out.println("\nO número de homens agressivos é: "+maleAngry);
	System.out.println("\nO número de outros calmos é: "+outrosCalmo);
	System.out.println("\nO número de nervosos com mais de 40 anos é: "+nervosa40);
	System.out.println("\nO número de calmos com menos de 18 anos é: "+calma18);
	
	}

}

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
		System.out.println("\nEntre com 1 se voc� do sexo masculino, 2 se voc� � do sexo feminino, e 3 para outros.");
		sexo = leia.nextInt();
		System.out.println("\nEntre com 1 se voc� � calmo(a), 2 se voc� � nervoso(a) e 3 se voc� � agressivo(a).");
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
	
	System.out.println("\nO n�mero de pessoas calmas �: "+quantCalma);
	System.out.println("\nO n�mero de mulheres nervosas �: "+femaleAngry);
	System.out.println("\nO n�mero de homens agressivos �: "+maleAngry);
	System.out.println("\nO n�mero de outros calmos �: "+outrosCalmo);
	System.out.println("\nO n�mero de nervosos com mais de 40 anos �: "+nervosa40);
	System.out.println("\nO n�mero de calmos com menos de 18 anos �: "+calma18);
	
	}

}

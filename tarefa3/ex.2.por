programa
{
	
	funcao inicio()
	{
		inteiro multiplo = 0

		para(inteiro x = 1; x <= 500; x++)
		{
			se(x % 3 == 0)
			{
				multiplo += x
			}
		}
		escreva("\nA soma dos multiplos de 3 entre 1 e 500 é: ", multiplo)

		//utilizando outra lógica
		multiplo = 0
		para(inteiro x = 3; x < 500; x = x + 3)
		{
			multiplo += x
		}
		escreva("\nA soma dos multiplos de 3 entre 1 e 500 é: ", multiplo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
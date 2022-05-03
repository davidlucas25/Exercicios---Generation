programa
{
	
	funcao inicio()
	{
		real notas[5], notaMaior = notas[0]

		para(inteiro x = 0; x < 5; x++)
		{
			escreva("Digite a pontuação ", x + 1, ": ")
			leia(notas[x])

			se(notas[x] > notaMaior)
			{
				notaMaior = notas[x]
			}
		}
		escreva("A maior pontuação foi: ", notaMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 75; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
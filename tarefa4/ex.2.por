programa
{
	
	funcao inicio()
	{
		inteiro vetorDado[11], maiorNum = 0, quantMax = 0, x, y
		real mediaDado = 0.0
		
		para(x = 0; x < 10; x++)
		{
			escreva("Digite o valor do lançamento ", x+1, ".")
			leia(vetorDado[x])

			se(vetorDado[x] > maiorNum)
			{
				maiorNum = vetorDado[x]
			}
			mediaDado += vetorDado[x]
		}

		para(x = 0; x < 10; x++)
		{
			se(vetorDado[x] == maiorNum)
			{
				quantMax++
			}
		}
		escreva("\nA média aritmética é: ", mediaDado/10)
		escreva("\nO maior número foi: ", maiorNum, "e ele foi sorteado ", quantMax, " vezes.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{	const inteiro linha = 5, coluna = 7
		real N1[linha][coluna], N2[linha][coluna], M1[linha][coluna], M2[linha][coluna]
		inteiro x, y
		//Preenchendo as matrizes N1 e N2
		para(x = 0; x < 4; x++)
		{
			para(y = 0; y < 6; y++)
			{
				escreva("\nDigite o elemento da linha ", x + 1, " e coluna ", y + 1, " da matriz N1. ")
				leia(N1[x][y])

				escreva("\nDigite o elemento da linha ", x + 1, " e coluna ", y + 1, " da matriz N2. ")
				leia(N1[x][y])
				
			}
		}
		//Criando as matrizes M1 e M2
		escreva("\nMatriz M1 (matriz soma) é: \n")
		para(x = 0; x < 4; x++)
		{
			para(y = 0; y < 6; y++)
			{
				M1[x][y] = N1[x][y] + N2[x][y]

				M2[x][y] = N1[x][y] - N2[x][y]

				escreva(M1[x][y], ", ")
			}
			escreva("\n")
		}
		escreva("\nMatriz M2 (matriz diferença) é: \n")
		para(x = 0; x < 4; x++)
		{
			para(y = 0; y < 6; y++)
			{
				escreva(M2[x][y], ", ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 644; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro linha, coluna, matriz[4][4], soma[4], somaDiagonal = 0

		para(linha = 0; linha < 3; linha++)
		{
			para(coluna = 0; coluna < 3; coluna++)
			{
				escreva("Digite o valor da linha ", linha + 1, " e coluna ", coluna + 1, ".")
				leia(matriz[linha][coluna])

				soma[linha] += matriz[linha][coluna]
				se(linha == coluna)
				{
					somaDiagonal  += matriz[linha][linha]
				}
			}
		}
		escreva("\nA soma da Diagonal Principal é: ", somaDiagonal)
		escreva("\nA soma do primeiro vetor é: ", soma[0])
		escreva("\nA soma do segundo vetor é: ", soma[1])
		escreva("\nA soma do terceiro vetor é: ", soma[2])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
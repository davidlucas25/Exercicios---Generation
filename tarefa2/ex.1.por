programa
{
	
	funcao inicio()
	{
		real P, E, M 
		escreva("Escreva o peso em kilos dos tomates: ")
		leia(P)

		se (P > 50)
		{
			E = P - 50
			M = E * 4.00
			escreva("\nMulta = ", M)
			escreva("\nExcesso = ", E)
		}
		senao
		{
			M = 0.0
			E = 0.0
			escreva("\nMulta =", M)
			escreva("\nExcesso =", E)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
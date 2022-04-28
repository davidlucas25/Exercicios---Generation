programa
{
	
	funcao inicio()
	{	
		inteiro anos, meses, dias
		escreva("Digite quantos anos, meses e dias você tem, respectivamente.")

		escreva("\nAnos: ")
		leia(anos)

		escreva("\nMeses: ")
		leia(meses)

		escreva("\nDias: ")
		leia(dias)

		inteiro conversao_dias = (anos*365) + (meses*30) + dias

		escreva("\nVocê tem ", conversao_dias, "dias de vida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
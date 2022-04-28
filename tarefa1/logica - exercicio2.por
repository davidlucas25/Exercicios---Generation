programa
{
	
	funcao inicio()
	{
		escreva("Digite sua idade em dias: ")
		inteiro idade_dias
		leia(idade_dias)

		inteiro anos, meses, dias
		anos = idade_dias / 365
		meses = (idade_dias - (anos*365)) / 30
		dias = idade_dias - (anos*365) - (meses*30)
		escreva("Você tem ",anos," anos, ",meses," meses, ", dias, " dias.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
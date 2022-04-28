programa
{
	
	funcao inicio()
	{
		escreva("Digite o tempo em segundos. ")
		inteiro tempo_segundos
		leia(tempo_segundos)

		inteiro horas, minutos, segundos
		horas = tempo_segundos/3600
		minutos = (tempo_segundos - (horas*3600)) / 60
		segundos = tempo_segundos - (minutos*60) - (horas*3600)

		escreva(tempo_segundos, " segundos tem ",horas," horas, ", minutos, " minutos e ", segundos, " segundos.")
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
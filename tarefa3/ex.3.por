programa
{
	
	funcao inicio()
	{
		real randow, somatorio = 0.0, media
		inteiro quant = 0
		escreva("\nDigite um valor numérico: ")
		leia(randow)
		
		enquanto(randow >= 0)
		{
			somatorio += randow
			quant++

			escreva("\nDigite um valor numérico: ")
			leia(randow)
		}
		
		media = somatorio / quant
		escreva("\nO somatório desses valores é: ", somatorio)
		escreva("\nA quantidade de valores apresentados foi de ", quant, " números.")
		escreva("\nA média dos valores apresentados doi de ", media, "média.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
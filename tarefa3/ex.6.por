programa
{
	
	funcao inicio()
	{
		inteiro randow, somatorio = 0
		escreva("\nDigite um número inteiro: ")
		leia(randow)
		enquanto(randow <= 0)
		{
			escreva("\nPor favor digite um número positivo.")
			leia(randow)
		}
		faca
		{
			somatorio += randow
			randow --
		}enquanto(randow > 0)
		escreva("\nSomatorio de 1 até ", randow, ": ", somatorio, ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		real numero
		escreva("\nDigite um número: ")
		leia(numero)
		enquanto(numero <= 0)
		{
			escreva("\nPor favor, digite um número positivo.")
			leia(numero)
		}

		escreva("\n", numero)
		enquanto(numero < 100)
		{
			numero = numero * 3	
			escreva("\n", numero)
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
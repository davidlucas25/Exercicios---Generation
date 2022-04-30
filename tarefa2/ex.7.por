programa
{
	
	funcao inicio()
	{
		real base, altura, area
		escreva("\nDigite a base do triângulo: ")
		leia(base)
		escreva("\nDigite a altura do triângulo: ")
		leia(altura)

		se (base <= 0 ou altura <= 0)
		{
			escreva("\nApresente valores positivos para base e para a altura.")
		}
		senao 
		{
			area = base * altura / 2
			escreva("\nA área do triângulo é: ", area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
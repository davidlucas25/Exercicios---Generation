programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real X1, Y1, X2, Y2, D, A
		//primeiro ponto
		escreva("Digite as coordenadas X, e Y do primeiro ponto.")
		escreva("X: ")
		leia(X1)
		escreva("Y: ")
		leia(Y1)

		//segundo ponto
		escreva("Digite as coordenadas X, e Y do segundo ponto.")
		escreva("X: ")
		leia(X2)
		escreva("Y: ")
		leia(Y2)

		A = mat.potencia((X2-X1), 2.0) + mat.potencia((Y2-Y1), 2.0)
		D = mat.raiz(A, 2.0)

		escreva("A distância entre os dois pontos é: ", D)
		
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
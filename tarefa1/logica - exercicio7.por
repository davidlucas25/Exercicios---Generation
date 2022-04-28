programa
{
	
	funcao inicio()
	{
		escreva("Dada um sistema linear de duas equações e duas incógnitas, digite os valores dos coeficientes, e o resultado de cada equação.")
		real a, b, c, d, E, f, x, y
		escreva("\nCoeficiente do X na primeira: ")
		leia(a)
		escreva("\nCoeficiente do Y na primeira: ")
		leia(b)
		escreva("\nResultado da primeira equação: ")
		leia(c)

		escreva("\nCoeficiente do X na segunda: ")
		leia(d)
		escreva("\nCoeficiente do Y na segunda: ")
		leia(E)
		escreva("\nResultado da segunda equação: ")
		leia(f)

		x = ((c*E)-(b*f)) / ((a*E)-(b*d))
		y = ((a*f)-(c*a)) / ((a*E)-(b*d))

		escreva("O valor de X no sistema é: ", x, "E o valor de Y no sistema é: ", y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
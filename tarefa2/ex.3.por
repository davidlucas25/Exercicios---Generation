programa
{
	
	funcao inicio()
	{
		real A, B, C, D, A2, B2, C2, D2
		escreva("\nDigite 4 números. \n")
		leia(A)
		leia(B)
		leia(C)
		leia(D)

		A2 = A*A
		B2 = B*B
		C2 = C*C
		D2 = D*D
		
		se ( C2 >= 1000)
		{
			escreva(C2)
		}
		senao 
		{
			escreva("\nO quadrado de ", A, " é ", A2)
			escreva("\nO quadrado de ", B, " é ", B2)
			escreva("\nO quadrado de ", C, " é ", C2)
			escreva("\nO quadrado de ", D, " é ", D2)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
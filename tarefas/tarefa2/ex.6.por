programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("\nDigite a sua idade: ")
		leia(idade)

		se (idade >= 5 e idade < 8)
		{
			escreva("\nCategoria Infantil A")
		}
		senao se (idade >= 8 e idade < 12)
		{
			escreva("\nCategoria Infantil B")
		}
		senao se (idade >= 12 e idade < 14)
		{
			escreva("\nCategoria Juvenil A")
		}
		senao se (idade >= 14 e idade < 18)
		{
			escreva("\nCategoria Juvenil B")
		}
		senao se (idade >= 18)
		{
			escreva("\nCategoria Adulta")
		}
		senao
		{
			escreva("\nContinue nadando assim e logo logo disputará na liga infantil")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
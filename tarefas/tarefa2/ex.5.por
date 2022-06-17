programa
{
	
	funcao inicio()
	{
		real ip //indice de poluição
		escreva("\nEscreva o índice de poluição: ")
		leia(ip)
		se (ip <= 0.25)
		{
			escreva("\nSua empresa está de acordo com os índices aceitáveis de poluição.")
		}
		senao se (ip > 0.25 e ip < 0.30)
		{
			escreva("\nVocês já ultrapassaram o índice permitido, retornem ao índice aceitável.")
		}
		senao se (ip >= 0.30 e ip < 0.40)
		{
			escreva("\nVocês ultrapassaram muito o índice permitido, indústrias do 1° grupo suspendam as operações.") 
		}
		senao se (ip >= 0.40 e ip < 0.50)
		{
			escreva("\nVocês ultrapassaram muito o índice permitido, indústrias do 1° e 2° grupo suspendam as operações.") 
		}
		senao 
		{
			escreva("\nVocês ultrapassaram muito o índice permitido, já virou bagunça, todas as suas indústrias estão com as operações suspendidas.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
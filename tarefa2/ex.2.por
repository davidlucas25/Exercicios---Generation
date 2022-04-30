programa
{
	
	funcao inicio()
	{
		real C, N, E, salario, extra, total
		escreva("Por favor, digite o seu código: ")
		leia(C)
		escreva("\nPor favor, digite a quantidade de horas trabalhadas: ")
		leia(N)

		salario = N * 10
		
		se (N > 50)
		{
			E = N - 50
			extra = E * 10
		}
		senao
		{
			E = 0
			extra = 0
		}
		total = salario + extra
		/*Aqui eu assumi que o excedente do salário seria o pagamento a mais que ele ganharia em cada hora 
		 por hora acima das 50, ou seja, apenas 10 reais por hora. Se caso o excedente fosse os 20 reais por hora, acima das 50
		 favor multiplicar a variável extra por 2, duas linhas abaixo.  			
		*/
		escreva("\nO seu salário total é = ", total, " reais, e seu salário excedente = ", extra, " reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
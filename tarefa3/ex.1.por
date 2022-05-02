programa
{
	
	funcao inicio()
	{
		real mediaSalario = 0.0, mediaFilho = 0.0, salario, salarioMin =0.0, salarioMax = 0.0
		inteiro filho
		
		para(inteiro x = 0; x < 20; x++)
		{
			escreva("Digite um salário: ", x)
			leia(salario)

			se (salario > salarioMax)
			{
				salarioMax = salario
			}

			se (salario < 100)
			{
				salarioMin++
			}
			
			mediaSalario += salario

			escreva("Digite a quantidade de filhos: ")
			leia(filho)
			mediaFilho += filho
		}
		escreva("\nA média do salário da população é: ", mediaSalario/20, " reais.")
		escreva("\nA média do número de filhos é: ", mediaFilho/20)
		escreva("\nO maior salário é: ", salarioMax, " reais.")
		escreva("\nO percentual de pessoas com salário até 100 é: ", salarioMin*100/20, "%.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
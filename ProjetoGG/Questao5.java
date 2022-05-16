package ProjetoGG;

import java.util.ArrayList;
import java.util.List;

public class Questao5 {
	 public String enunciado;
	 public List<String> alternativas;
	 public String feedbackE;
	 public String feedbackC;
	 
	 public Questao5()
	 {
		 
		this.enunciado = "Qual a porcentagem de cidades brasileiras que despejam o seu lixo produzido em aterros sanitários?";
		this.alternativas = new ArrayList<String>();
		alternativas.add("a) 100% das cidades.");
		alternativas.add("b) 80% das cidades.");
		alternativas.add("c) mais de 50% das cidades");
		alternativas.add("d) 40% das cidades.");
		alternativas.add("e) menos de 30% das cidades.");
	 }
	 
	  public void execute() 
	  {	
		 System.out.println("Questão 05 - Quiz ConscientizaGen");
		 System.out.println(enunciado);
		 for (String alternativa : alternativas) 
		 {
			System.out.println(alternativa);
		 }
		 String resposta;
		 resposta = Scanner.ler();
		 String feedback = getFeedback(resposta);
		 System.out.println(feedback);
		 
		
	  }

	private String getFeedback(String resposta) 
	{
		if(taCerto(resposta)) 
		{
			return "Resposta correta! "
					+ "\nDe acordo com dados da Pesquisa de Saneamento Básico do Instituto Brasileiro de Geografia e Estatística (IBGE), realizada em 2008, somente"
					+ "\n28% das cidades possuíam aterros sanitários, e mais de 50% delas despejavam o lixo produzido em lixões. \n \n";
		}
		else return "Resposta incorreta! De acordo com dados da Pesquisa de Saneamento Básico do IBGE, apenas 28% das cidades possuíam aterros sanitários,"
				+ "\ne mais de 50% delas despejavam o lixo produzido em lixões. \n";
	    }

	private boolean taCerto(String resposta) 
	  {
		return resposta.equals("e");	
	  }
	
}

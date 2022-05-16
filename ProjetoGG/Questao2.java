package ProjetoGG;

import java.util.ArrayList;
import java.util.List;

public class Questao2 {
	 public String enunciado;
	 public List<String> alternativas;
	 public String feedbackE;
	 public String feedbackC;
	 
	 public Questao2()
	 {
		 
		this.enunciado = "A produção de lixo é inevitavel na forma como a nossa sociedade se organiza. A geração de resíduos sólidos vem aumentando no Brasil ao longo dos anos.\r\n"
				+ "Os dados mais recentes de geração destes resíduos aponta que em 2018, no Brasil,  foram geradas:";
		this.alternativas = new ArrayList<String>();
		alternativas.add("a) 7,9 toneladas");
		alternativas.add("b) 79 toneladas");
		alternativas.add("c) 79 mil toneladas");
		alternativas.add("d) 79 milhões de toneladas");
		alternativas.add("e) 7 toneladas");
	 }
	 
	  public void execute() 
	  {	
		 System.out.println("Questão 02 - Quiz ConscientizaGen");
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
			return " Resposta correta! "
					+ "\nDe acordo com os dados do Panorama dos Resíduos sólidos da Abrelpe foram geradas 79 milhões de toneladas de resíduos sólidos urbanos,"
					+ "\num aumento de pouco menos de 1% em relação ao ano anterior.";
		}
		else return "Resposta incorreta! De acordo com os dados do Panorama dos Resíduos sólidos da Abrelpe o número é ainda maior!";
	    }

	private boolean taCerto(String resposta) 
	  {
		return resposta.equals("d");	
	  }
	
}

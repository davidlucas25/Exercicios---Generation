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
		 
		this.enunciado = "A produ��o de lixo � inevitavel na forma como a nossa sociedade se organiza. A gera��o de res�duos s�lidos vem aumentando no Brasil ao longo dos anos.\r\n"
				+ "Os dados mais recentes de gera��o destes res�duos aponta que em 2018, no Brasil,  foram geradas:";
		this.alternativas = new ArrayList<String>();
		alternativas.add("a) 7,9 toneladas");
		alternativas.add("b) 79 toneladas");
		alternativas.add("c) 79 mil toneladas");
		alternativas.add("d) 79 milh�es de toneladas");
		alternativas.add("e) 7 toneladas");
	 }
	 
	  public void execute() 
	  {	
		 System.out.println("Quest�o 02 - Quiz ConscientizaGen");
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
					+ "\nDe acordo com os dados do Panorama dos Res�duos s�lidos da Abrelpe foram geradas 79 milh�es de toneladas de res�duos s�lidos urbanos,"
					+ "\num aumento de pouco menos de 1% em rela��o ao ano anterior.";
		}
		else return "Resposta incorreta! De acordo com os dados do Panorama dos Res�duos s�lidos da Abrelpe o n�mero � ainda maior!";
	    }

	private boolean taCerto(String resposta) 
	  {
		return resposta.equals("d");	
	  }
	
}

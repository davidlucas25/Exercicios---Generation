package ProjetoGG;
import java.util.ArrayList;
import java.util.List;

public class Questao3 {
	 public String enunciado;
	 public List<String> alternativas;
	 public String feedbackE;
	 public String feedbackC;
	 
	 public Questao3()
	 {
		 
		this.enunciado = "Qual a porcentagem de municípios brasileiros que apresentam problemas ambientais? ";
		this.alternativas = new ArrayList<String>();
		alternativas.add("a) 50%.");
		alternativas.add("b) 25%.");
		alternativas.add("c) 19%.");
		alternativas.add("d) 90%.");
		alternativas.add("e) 97%.");
	 }
	 
	  public void execute() 
	  {	
		 System.out.println("Questão 03 - Quiz ConscientizaGen");
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
							+ "De acordo com uma pesquisa realizada pelo Instituto Brasileiro de Geografia e Estatística (IBGE), "
							+ "\n90% dos municípios brasileiros apresentam problemas ambientais, e entre os mais relatados estão as queimadas, desmatamento e assoreamento. \n \n";
		}
		else return "Resposta incorreta! De acordo com uma pesquisa realizada pelo Instituto Brasileiro de Geografia e Estatística (IBGE),"
				+ "\n90% dos municípios brasileiros apresentam problemas ambientais, e entre os mais relatados estão as queimadas, desmatamento e assoreamento. \n \n";
	    }

	private boolean taCerto(String resposta) 
	  {
		return resposta.equals("d");	
	  }
	
}

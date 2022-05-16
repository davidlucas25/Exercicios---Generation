package ProjetoGG;

import java.util.ArrayList;
import java.util.List;

public class Questao1 {
	
	 public String enunciado;
	 public List<String> alternativas;
	 public String feedbackE;
	 public String feedbackC;
	 
	 public Questao1()
	 {
		this.enunciado = "A Amazônia legal sofre todos os dias com o desmatamento ilegal. A motivação para esse desmatamento podem ser diversos. Entre eles podemos citar\r\n"
				+ "a derrubada de arvores para utilização do solo para agropecuaria e a comercialização de madeira ilegal. Nesse contexto, qual a perda média diaria de arvores da Amazônia legal?";
		this.alternativas = new ArrayList<String>();
		alternativas.add("a) 150");
		alternativas.add("b) 1.500");
		alternativas.add("c) 15.000");
		alternativas.add("d) 150.000 árvores");
		alternativas.add("e) 1.500.000 árvores");
	 }
	 
	  public void execute() 
	  {
		 System.out.println("Questão 01 - Quiz ConscientizaGen");
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
					+ "\nDe acordo com com o painel Plena Mata só este ano foram desmatadas mais de 474,8 milhões de arvores na região da amazônia legal \n \n";
		}
		else return "Resposta incorreta! Pode parecer assustador, mas é muito mais! \n \n";
	    }

	private boolean taCerto(String resposta) 
	  {
		return resposta.equals("e");	
	  }

}

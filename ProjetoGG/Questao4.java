package ProjetoGG;

import java.util.ArrayList;
import java.util.List;

public class Questao4 {
	 public String enunciado;
	 public List<String> alternativas;
	 public String feedbackE;
	 public String feedbackC;
	 
	 public Questao4()
	 {
		 
		this.enunciado = "Qual a porcentagem de pagamento das multas ambientais cobradas no Brasil?";
		this.alternativas = new ArrayList<String>();
		alternativas.add("a) 70% de pagamento efetuado.");
		alternativas.add("b) 50% de pagamento efetuado.");
		alternativas.add("c) 30% de pagamento efetuado.");
		alternativas.add("d) 9% de pagamento efetuado.");
		alternativas.add("e) 3% de pagamento efetuado.");
	 }
	 
	  public void execute() 
	  {	
		 System.out.println("Questão 04 - Quiz ConscientizaGen");
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
			return "Resposta correta! "+"Em um relatório entregue ao Tribunal de Contas da União (TCU), constava que de cada 100 reais"
					+ "\nem multas aplicadas pelo Instituto Brasileiro de Meio Ambiente (Ibama), menos e três reais entraram nos caixas.";
		}
		else return "Resposta incorreta! De acordo com os dados do Panorama dos Resíduos sólidos da Abrelpe o número é ainda maior! \n \n";
	    }

	private boolean taCerto(String resposta) 
	  {
		return resposta.equals("e");	
	  }
	
}

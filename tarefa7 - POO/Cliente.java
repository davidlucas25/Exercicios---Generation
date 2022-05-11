package POO;

public class Cliente {
	private String primeiroNome;
	private String ultimoNome;
	private String sexo;
	private int idade;
	
	public Cliente(String primeiro, String ultimo, String sexo, int idade) {
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	public String getContato()
	{	
		String Contato = "Ol� "+primeiroNome+" "+ultimoNome+" como voc� est�? Estamos com saudades de voc�!\n"
				+ "Temos excelentes itens aqui na nossa loja e sabemos que voc� vai gostar, vem dar uma conferida!";
		return Contato;
	}
	
	public String Classificacao()
	{
		if(this.idade > 0 && this.idade < 1) {
			return "Rec�m-nascido";
		}
		if(this.idade >= 1 && this.idade < 10) {
			return "Crian�a";
		}
		if(this.idade >= 10 && this.idade < 13)
		{
			return "Pr�-adolescente";
		}
		if(this.idade >= 13 && this.idade < 18) {
			return "Adolescente";
		}
		if(this.idade >= 18) {
			return "Adulto";
		}
		return "Idade n�o classificada!!!";
	}
	
	
}

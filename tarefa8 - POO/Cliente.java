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
		String Contato = "Olá "+primeiroNome+" "+ultimoNome+" como você está? Estamos com saudades de você!\n"
				+ "Temos excelentes itens aqui na nossa loja e sabemos que você vai gostar, vem dar uma conferida!";
		return Contato;
	}
	
	public String Classificacao()
	{
		if(this.idade > 0 && this.idade < 1) {
			return "Recém-nascido";
		}
		if(this.idade >= 1 && this.idade < 10) {
			return "Criança";
		}
		if(this.idade >= 10 && this.idade < 13)
		{
			return "Pré-adolescente";
		}
		if(this.idade >= 13 && this.idade < 18) {
			return "Adolescente";
		}
		if(this.idade >= 18) {
			return "Adulto";
		}
		return "Idade não classificada!!!";
	}
	
	
}

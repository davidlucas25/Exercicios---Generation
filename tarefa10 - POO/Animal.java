package POO;

public abstract class Animal {
	private String nome;
	private int idade;
	public int velocidade;
	public int altura = 0;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract void emitirSom();
	public abstract void executarAcao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

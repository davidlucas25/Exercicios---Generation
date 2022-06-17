package POO;

public class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom(String animal) {
		if(animal == "cachorro") {
			System.out.println("\nAu, au, au");; 
		} else if(animal == "cavalo") {
			System.out.println("\nhinn in in");
		} else if(animal == "preguica") {
			System.out.println("\nAaaaaan, aaaaan");
		} else {
			System.out.println("Som não classificado.");
		}
	}
	
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

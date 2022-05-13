package POO;

public class Cachorro extends Animal{
	private String raca;
	private String cor;
	
	public Cachorro(String raca, String cor, String nome, int idade) {
		super(nome, idade);
		this.raca = raca;
		this.cor = cor;
	}
	
	public void imprimirInfo() {
		System.out.println("\nEste Cachorro se chama "+getNome()+", tem "+getIdade()+" anos de idade.");
		System.out.println("\nÉ da raça "+this.raca+", e sua cor é "+this.cor+".");
	}
	
	public String latir(String raca) {
		if(raca == "pinscher") {
			return "au au au, au au au, au au au au au au, au au au au au, au au au";
		}
		else {
			return "au au au";
		}
	}
}

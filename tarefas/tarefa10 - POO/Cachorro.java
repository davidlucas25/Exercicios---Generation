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
		System.out.println("\n� da ra�a "+this.raca+", e sua cor � "+this.cor+".");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("\nAu, au au... au au...");
		
	}

	@Override
	public void executarAcao() {
		velocidade = 40;
		System.out.println("\nA velocidade desse cachorro �: "+velocidade);
		
	}
}

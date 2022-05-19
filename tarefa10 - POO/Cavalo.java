package POO;

public class Cavalo extends Animal {
	private String cor;
	private int velocidades; 
	
	public Cavalo(String cor, int vel, String nome, int idade) {
		super(nome, idade);
		this.cor = cor;
		this.velocidades = vel;
	}
	
	public void imprimirInfo() {
		System.out.println("\nEste Cachorro se chama "+getNome()+", tem "+getIdade()+" anos de idade.");
		System.out.println("\nE sua cor � "+this.cor+". Ele corre at� "+this.velocidades+"km/h.");
	}
	
	public void galopar() {
		this.velocidades = 10;
	}
	
	public void aceletar() {
		this.velocidades += 10;
	}

	@Override
	public void emitirSom() {
		System.out.println("\niiirrrr�, rilinchin");
	}

	@Override
	public void executarAcao() {
		velocidade = 80;
		System.out.println("\nPocot�... pocot�... pocot�...");
		System.out.println("\nA velocidade desse cavalo �: 80km/h");
	}
	
}

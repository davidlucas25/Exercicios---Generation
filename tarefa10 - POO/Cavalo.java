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
		System.out.println("\nE sua cor é "+this.cor+". Ele corre até "+this.velocidades+"km/h.");
	}
	
	public void galopar() {
		this.velocidades = 10;
	}
	
	public void aceletar() {
		this.velocidades += 10;
	}

	@Override
	public void emitirSom() {
		System.out.println("\niiirrrrí, rilinchin");
	}

	@Override
	public void executarAcao() {
		velocidade = 80;
		System.out.println("\nPocotó... pocotó... pocotó...");
		System.out.println("\nA velocidade desse cavalo é: 80km/h");
	}
	
}

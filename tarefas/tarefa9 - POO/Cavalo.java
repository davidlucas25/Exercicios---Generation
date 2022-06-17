package POO;

public class Cavalo extends Animal {
	private String cor;
	private int velocidade; 
	
	public Cavalo(String cor, int vel, String nome, int idade) {
		super(nome, idade);
		this.cor = cor;
		this.velocidade = vel;
	}
	
	public void imprimirInfo() {
		System.out.println("\nEste Cachorro se chama "+getNome()+", tem "+getIdade()+" anos de idade.");
		System.out.println("\nE sua cor é "+this.cor+". Ele corre até "+this.velocidade+"km/h.");
	}
	
	public void galopar() {
		this.velocidade = 10;
	}
	
	public void aceletar() {
		this.velocidade += 10;
	}
	
}

package POO;

public class Preguica extends Animal{
	private String cor;
	
	public Preguica(String cor, String nome, int idade) {
		super(nome, idade);
		this.cor = cor;
	}
	
	public void imprimirInfo() {
		System.out.println("\nEsta Pregui�a se chama "+getNome()+", tem "+getIdade()+" anos de idade.");
		System.out.println("\nE sua cor � "+this.cor+".");
	}
	
	public void SubirArvore() {
		System.out.println("\nEstooooouuuuuu.... subindoooo..... naaaa..... arvoreeeeeeeee.....");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\n.....................");
		System.out.println("\nJaaaa�..... subiii...... metadeeeee......");
	}
}

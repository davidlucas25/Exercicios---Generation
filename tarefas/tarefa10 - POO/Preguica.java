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
	

	@Override
	public void emitirSom() {
		System.out.println("\nAaaaaaaaa...... aaaaaaaaaaaa...");
		
	}

	@Override
	public void executarAcao() {
		altura += 5;
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
		System.out.println("\nA altura que a pregui�a est� �: "+altura);
		
	}
}

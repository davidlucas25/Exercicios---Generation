package POO;

public class AnimalObjeto {

	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro("Pinscher", "preto", "Brutus", 2);
		Cavalo meuCavalo = new Cavalo("Branco", 50, "Pegasus", 10);
		Preguica meuPreguica = new Preguica("Cinza", "Julia", 19);
		
		meuCachorro.imprimirInfo();
		meuCachorro.emitirSom();
		meuCachorro.executarAcao();
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		
		meuCavalo.imprimirInfo();
		meuCavalo.emitirSom();
		meuCavalo.executarAcao();
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------");
		
		meuPreguica.imprimirInfo();
		meuPreguica.emitirSom();
		meuPreguica.executarAcao();
	}

}

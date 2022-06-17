package POO;

public class AnimalObjeto {

	public static void main(String[] args) {
		Animal meuAnimal = new Animal("Derick", 2);
		Cachorro meuCachorro = new Cachorro("Pinscher", "preto", "Brutus", 2);
		Cavalo meuCavalo = new Cavalo("Branco", 50, "Pegasus", 10);
		Preguica meuPreguica = new Preguica("Cinza", "Julia", 19);
		
		meuCachorro.imprimirInfo();
		meuAnimal.emitirSom("cachorro");
		
		meuCavalo.imprimirInfo();
		meuAnimal.emitirSom("cavalo");
		
		meuPreguica.imprimirInfo();
		meuAnimal.emitirSom("preguica");
	}

}

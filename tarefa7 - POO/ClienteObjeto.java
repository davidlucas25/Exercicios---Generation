package POO;

public class ClienteObjeto {
	
	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente("David","Mendes","masculino",19);
		
		System.out.println(cliente1.getContato());
	}

}

package exercicios;

public class lacoRepeticao1 {
	
	public static final int num = 1000;
	public static void main(String[] args) {
		
		
		int x;
		
		for(x=0; x<=1000; x++)
		{
			if((num + x) % 11 == 5)
			{
				System.out.println("\n"+(num+x));
			}
		}
	}

}

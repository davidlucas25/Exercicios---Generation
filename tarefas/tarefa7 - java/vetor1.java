package exercicios;

public class vetor1 {

	public static void main(String[] args) {
	
		int[] A = new int[6];
		int soma, x;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("\nA soma é: "+soma);
		
		A[4] = 100;
		
		for(x = 0; x < 6; x++) {
			System.out.println("\nVetor A: \n"+A[x]);
		}
	}

}

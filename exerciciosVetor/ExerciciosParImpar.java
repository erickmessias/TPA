import java.util.Scanner;

public class ExerciciosParImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		final int TAM=20;
		
		int A[], B[], i;
		
		A = new int[TAM];
		B = new int[TAM];
		
		int pos = 0;
		
		System.out.println("Digite 20 números:");
        for (i = 0; i < 20; i++) {
            A[i] = ler.nextInt();
        }


        for (i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[pos] = A[i];
                pos++;
            }
        }

        for ( i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[pos] = A[i];
                pos++;
            }
        }


        System.out.println("\nVetor B (pares primeiro, depois ímpares):");
        for (i = 0; i < 20; i++) {
        	
            System.out.print(B[i] + " ");
        }

	}

}
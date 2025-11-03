
import java.util.Scanner;

public class TabuadaVetor {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        final int TAM = 5;

        int A[], i, multi; 
       
        A = new int[TAM]; 

        System.out.println("Digite 5 números inteiros:");
        for (i = 0; i < TAM; i++) {
            A[i] = ler.nextInt();
        }

       
        for (i = 0; i < TAM; i++) {
            System.out.println("\nTabuada do " + A[i] + ":");
            
            multi = 1; 
            while (multi <= 10) {
                System.out.println(A[i] + " x " + multi + " = " + (A[i] * multi));
                multi++;
            }
        }
    }
}

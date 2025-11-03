
import java.util.Scanner;

public class VetorFatorial{

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int contador; 

        System.out.println("Digite " + TAM + " números inteiros:");
        for (int i = 0; i < TAM; i++) {
           A[i] = ler.nextInt();
        }

        
        for (int i = 0; i < TAM; i++) {
            int fat = 1;
            contador = 2;
            while (contador <= A[i]) {
                fat *= contador;
                contador++;
            }
            B[i] = fat;
        }

        System.out.println("Fatoriais:");
        for (int i = 0; i < TAM; i++) {
            System.out.println("Fatorial de " + A[i] + " = " + B[i]);
        }

   }
}




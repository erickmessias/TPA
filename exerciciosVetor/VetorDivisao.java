import java.util.Scanner;

public class VetorDivisao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 2; 

        int i, divisor; 
        int a[];

        a = new int[TAM];

      
        for (i = 0; i < TAM; i++) {
            System.out.println("Entre com o " + (i + 1) + " valor:");
            a[i] = ler.nextInt();
        }

        System.out.println(" Resultados:");


        for (i = 0; i < TAM; i++) {
            System.out.print("Divisores de " + a[i] + ": ");

    
            for (divisor = 1; divisor <= a[i]; divisor++) {
                if (a[i] % divisor== 0) {
                    System.out.print(divisor + " ");
                }
            }

           
        }
    }
}

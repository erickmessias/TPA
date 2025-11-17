import java.util.Scanner;

public class VetorPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 2;

        int i, num; 
        int a[];    

        a = new int[TAM];


        for (i = 0; i < TAM; i++) {
            System.out.println("Entre com o " + (i + 1) + "º valor:");
            a[i] = ler.nextInt();
        }

     
        for (i = 0; i < TAM; i++) {
         
            System.out.print("Pares de 0 até " + a[i] + ": ");

            
            for (num = 0; num <= a[i]; num++) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}

import java.util.Scanner;

public class VetorPrimo {
   
	
	public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);

        final int TAM = 10;

        int i, num, d, teste;
        int[] A = new int[TAM];


        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i+1) + " valor:");
            A[i] = ler.nextInt();
        }
       
        for (i = 0; i < TAM; i++) {

            num = A[i];
            d= 0;

            if (num <= 1) {
                System.out.println( num + " Nao é primo");
            } 
            else {

                for (teste = 2; teste < num; teste++) {
                    if (num % teste == 0) {
                        d= d + 1; 
                    }
                }

                if (d == 0) {
                    System.out.println( num + " é PRIMO");
                } else {
                    System.out.println(  num + " Nao é primo");
                }
            }
        }
       }
	}


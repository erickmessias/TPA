import java.util.Scanner;

public class numeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numero;

        System.out.print("Digite o número: ");
        numero = in.nextDouble();

        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println(" negativo");
        } else {
            System.out.println(" neutro");
        }

    }
}
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double fahrenheit, graus;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = ler.nextDouble();
        graus = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperatura em graus = ", graus);

        if (graus < 15) {
            System.out.println("frio");
        } else if (graus >=22) {
            System.out.println(" neutra");
        } else {
            System.out.println("calor");
        }
    }
}


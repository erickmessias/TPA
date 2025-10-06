import java.util.*;

public class exerciciosSeSenao {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double salario;

        System.out.println("Informe o salario: ");
        salario = ler.nextDouble();

        if (salario < 1302) {
            System.out.println("Menos que o salario minimo");
        } else {
            System.out.println("Maior ou igual ao salario minimo");
        }

        
    }

	 }



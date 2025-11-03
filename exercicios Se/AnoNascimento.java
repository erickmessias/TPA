import java.util.Scanner;
public class AnoNascimento {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int anoNascimento,anoAtual,idade;
		System.out.println("informe o ano atual");
		anoAtual= ler.nextInt();
		System.out.println("informe o ano de nascimento");
		anoNascimento= ler.nextInt();
		idade= anoAtual - anoNascimento;
		System.out.println("idade =" + idade);
		if (idade<18) {
			System.out.println("Menor de idade");
		}else {
			System.out.println("maior de idade");
		}

		
		
		
		
		
	}

}

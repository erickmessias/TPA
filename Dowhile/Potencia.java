import java.util.Scanner;



public class Potencia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int n, e;
		int i = 1;
		int p = 1;

		
		System.out.println("Digite o número");
		n = ler.nextInt();
		
		System.out.println("Digite o expoente");
		e = ler.nextInt();
		
		
		do {
			
		   p = p*n;
		   
		   i++;
			
		   
		   
		}while(i <= e);
		
		System.out.println("A potência de "+n+" elevado a "+e+" é: "+p);
		
		
	}	
}

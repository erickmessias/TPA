
public class Soma {

	public static void main(String[] args) {
		
		int i = 1, soma = 0;
		
		while(i<=100) {
			soma = soma+i;
			
			i++;
		}
		
		System.out.println("A soma dos números em um intervalo de 1 a 100 é: "+soma);
	}

}

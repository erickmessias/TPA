import java.util.Scanner;
package exercicios5;
public class Notas {
	public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	double n1,n2,n3,n4,mi,nm,ex;
	
	System.out.println("Digite a primeira nota:");
	n1 = ler.nextDouble();
	
	System.out.println("Digite a segunda nota:");
	n2 = ler.nextDouble();
	
	System.out.println("Digite a terceira nota ");
	n3 = ler.nextDouble();
	
	System.out.println("Digite a quarta nota");
	n4 = ler.nextDouble();
	
	mi = (n1+n2+n3+n4)/4;
	
	System.out.println("Media:"+mi);
	
	if (mi < 5) {
		System.out.println("reprovado");
	}else if (mi > 7) {
		System.out.println("Aprovado");
	}else {
		System.out.println("Exame");
		ex = ler.nextDouble();
		nm = (mi+ex)/2;
		System.out.println("Nova Média"+nm);
		if (nm >= 7) {			
			System.out.println("aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
	
	}
}

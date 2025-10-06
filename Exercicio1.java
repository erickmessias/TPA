import java.util.Scanner;
public class Exercicio1 {
   public static void main(String[] args) {
	   
	   Scanner ler = new Scanner(System.in);
	   
	   double taxa,tempo,valor;
	   
	   System.out.println("Digite o valor:  ");
	  
	    valor = ler.nextDouble();
	    
	    System.out.println("Digite a taxa:  ");
	    
	    taxa = ler.nextDouble();
	    
	    System.out.println("Digite o Tempo: ");
	    
	    tempo = ler.nextDouble();
	    
	    double prestacao = valor+(valor*(taxa/100)*tempo);
	    
	    System.out.println("Prestações=" + prestacao);
	    	   
   }
}

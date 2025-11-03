package prjLacoInicio;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int i,r,n;
		
		for(i=1;i<=10;i++) {
			System.out.println("tabuada do "+i+ ":");
			for(n=1;n<=10;n++);
			r = i*n;
			System.out.println(i+" x "+n+" ="+r);
		}
		
	}
}

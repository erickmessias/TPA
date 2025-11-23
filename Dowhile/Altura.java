
public class Altura {

	public static void main(String[] args) {
		
		double aJ = 134;
		double aP = 145;
		int i = 1;
		
		do {
			
			aJ = aJ + 2.5;
			
			aP = aP + 2;
			
			i++;
			
		}while(aJ<aP);
		
		System.out.println("João irá demorar "+i+"  anos para ficar maior que Pedro");
	}

}

package propostos04for;

import java.util.Scanner;
import java.util.Locale;

public class ExProposto0403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 0 ; i < casos ; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double nf = n1 * 0.2 + n2 * 0.3 + n3 * 0.5;
			
			System.out.printf("%.2f%n", nf);
		}
		
		sc.close();

	}

}

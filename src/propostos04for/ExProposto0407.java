package propostos04for;

import java.util.Scanner;

public class ExProposto0407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			
			double quadrado = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			
			System.out.printf("%s %.0f %.0f %n", i, quadrado, cubo );
			
		}
		sc.close();

	}

}

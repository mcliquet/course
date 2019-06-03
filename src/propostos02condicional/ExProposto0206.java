package propostos02condicional;

import java.util.Scanner;

public class ExProposto0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double entrada;
		
		entrada = sc.nextDouble();
		
		if (entrada >= 0 && entrada <= 25) {
			System.out.println("Intervalo entre (0, 25)");
		}
		else if (entrada > 25 && entrada <= 50) {
				System.out.println("Intervalo entre (25, 50)");
		}
		else if (entrada > 50 && entrada <= 75) {
			System.out.println("Intervalo entre (50, 75)");
		}
		else if (entrada > 75 && entrada <= 100) {
			System.out.println("Intervalo entre (75, 100)");
		}
		else {
			System.out.println("Fora do intervalo.");
		}
		
		sc.close();
		

	}

}

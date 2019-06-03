package propostos02condicional;

import java.util.Scanner;

public class ExProposto0208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double valor, tax;
		
		valor = sc.nextDouble();
		
		if (valor > 0 && valor <= 2000) {
			System.out.println("Isento.");
		}
		else if (valor > 2000 && valor <= 3000) {
			tax = (valor - 2000) * 0.08;
			System.out.printf("R$ %.2f", tax);
		}
		else if (valor > 3000 && valor <= 4500) {
			tax = (1000 * 0.08) + ((valor - 3000) * 0.18);
			System.out.printf("R$ %.2f", tax);
		}
		else {
			tax = (1000 * 0.08) + (1500 * 0.18) + ((valor - 4500) * 0.28);
			System.out.printf("R$ %.2f", tax);
		}
		
		
		sc.close();
	}

}

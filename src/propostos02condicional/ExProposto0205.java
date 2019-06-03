package propostos02condicional;

import java.util.Scanner;

public class ExProposto0205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// entendi como o programa pedindo pra somar dois itens diferentes.
		int item, item2;
		double prod1 = 0, prod2 = 0, total;
		
		item = sc.nextInt();
		item2 = sc.nextInt();
		
		if (item == 1) {
			prod1 = 4.00;
		}
		else if (item == 2) {
			prod1 = 4.50;
		}
		else if (item == 3) {
			prod1 = 5;
		}
		else if (item == 4) {
			prod1 = 2;
		}
		else if (item == 5) {
			prod1 = 1.5;
		}
		else {
			System.out.println("f");
		}
		
		
		if (item2 == 1) {
			prod2 = 4.00;
		}
		else if (item2 == 2) {
			prod2 = 4.50;
		}
		else if (item2 == 3) {
			prod2 = 5;
		}
		else if (item2 == 4) {
			prod2 = 2;
		}
		else if (item2 == 5) {
			prod2 = 1.5;
		}
		else {
			System.out.println("f");
		}
		
		total = prod1 + prod2;
		
		System.out.println("Total: R$" +total);
		
		
		sc.close();

	}

}

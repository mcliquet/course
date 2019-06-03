package propostos04for;

import java.util.Scanner;

public class ExProposto0401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor: ");
		
		int x = sc.nextInt();
		
		if (x >= 0 && x < 1000) {
			for (int i = 1; i < x; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
			if (x % 2 == 1) {
				System.out.println(x);
			}
		}
		sc.close();
	}
}

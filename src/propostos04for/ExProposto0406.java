package propostos04for;

import java.util.Scanner;

public class ExProposto0406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			int div = number % i;
			if (div == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}

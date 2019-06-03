package propostos04for;

import java.util.Scanner;

public class ExProposto0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for ( int i = 1; i <= n; i++) {
			double val1 = sc.nextInt();
			double val2 = sc.nextInt();
			if (val2 != 0) {
				double tot = val1 / val2;
				System.out.printf("%.1f", tot);
			}
			else {
				System.out.println("divisão impossível");
			}
		}
		sc.close();
		
	}

}

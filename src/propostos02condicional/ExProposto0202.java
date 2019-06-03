package propostos02condicional;

import java.util.Scanner;

public class ExProposto0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
		
		
		sc.close();

	}

}

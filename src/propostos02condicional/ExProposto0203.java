package propostos02condicional;

import java.util.Scanner;

public class ExProposto0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0) {
			System.out.println("São Multiplos");
		}
		else if (b % a == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();

	}

}

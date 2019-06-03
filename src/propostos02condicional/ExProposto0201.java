package propostos02condicional;

import java.util.Scanner;

public class ExProposto0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}
		
		sc.close();
	}

}

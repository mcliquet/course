package propostos01sequencial;

import java.util.Scanner;

public class ExProposto0103 {

	public static void main(String[] args) {
		
		int a, b, c, d, dif;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com os valores a, b, c e d:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.println("Diferença = " +dif);
		
		sc.close();
		
	}

}

package fixacao;

import java.util.Scanner;

public class ExFix02WhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N:");
		int number = sc.nextInt();
		int maior = 0;
		
		while (number <= 0) {
			System.out.print("N must be positive! Try again: ");
			number = sc.nextInt();
		}
		
		for (int i = 1; i <= number; i++) {
			System.out.printf("Value #%s:", i);
			int next = sc.nextInt();
			if (next >= maior) {
				maior = next;
			}
		}
		
		System.out.println("Higher:" +maior);
		
		sc.close();

	}

}

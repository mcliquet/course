package propostos03while;

import java.util.Scanner;

public class ExProposto0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if ( x >= 0 && y >= 0 ) {
				System.out.println("Q1");
				if ( x > 0 && y == 0) {
					System.out.println("Eixo Y");
				}
				else if ( x == 0 && y > 0) {
					System.out.println("Eixo X");
				}
				
			}
			else if ( x <= 0 && y >= 0) {
				System.out.println("Q2");
				if ( x > 0 && y == 0) {
					System.out.println("Eixo Y");
				}
				else if ( x == 0 && y > 0) {
					System.out.println("Eixo X");
				}
				
				
			}
			else if ( x <= 0 && y <= 0) {
				System.out.println("Q3");
				if ( x > 0 && y == 0) {
					System.out.println("Eixo Y");
				}
				else if ( x == 0 && y > 0) {
					System.out.println("Eixo X");
				}
				
				
			}
			else if ( x >= 0 && y <= 0) {
				System.out.println("Q4");
				if ( x > 0 && y == 0) {
					System.out.println("Eixo Y");
				}
				else if ( x == 0 && y > 0) {
					System.out.println("Eixo X");
				}
				
			}
			else {
				System.out.println("acabou!");
			}
			System.out.println("Entre com o próximo:");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		System.out.println("fim");

		sc.close();

	}

}

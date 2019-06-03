package propostos02condicional;

import java.util.Scanner;

public class ExProposto0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if ( x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if ( x >= 0 && y >= 0 ) {
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
		
		
		
		sc.close();
		
	}

}

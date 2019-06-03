package fixacao;

import java.util.Scanner;

import entitiesFixacao.Rectangle;

public class ExFix03Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		Rectangle rectangle = new Rectangle();
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("AREA= %s m².%n", rectangle.area());
		System.out.printf("PERIMETER= %s m.%n", rectangle.perimeter());
		System.out.printf("DIAGONAL= %s m.%n", rectangle.diagonal());
		
		
		sc.close();

	}

}

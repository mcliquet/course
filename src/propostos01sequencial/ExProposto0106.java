package propostos01sequencial;

import java.util.Scanner;

public class ExProposto0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = ( a * c ) / 2;
		circulo = Math.PI * ( c * c );
		trapezio = ( ( a + b ) / 2 ) * c;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);
	
		sc.close();

	}

}

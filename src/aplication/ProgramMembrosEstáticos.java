package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramMembrosEst�ticos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Calculator calc = new Calculator();
		// n�o precisa instanciar objeto quando a opera��o for est�tica
		
		System.out.println("Enter radius value:");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius); //tem que trocar pro nome da classe
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f", Calculator.PI);
		
		sc.close();
	}

	

}

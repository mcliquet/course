package util;

public class Calculator {
	
	public static final double PI = 3.14159; //palavra final atribui constante(tudo letra maiúscula e _)

	public static double circunference(double radius) { //caso seja uma operação imutável, pode torna-la static
		return 2 * PI * radius;
	}

	public static double volume(double radius) { //caso seja uma operação imutável, pode torna-la static
		return 4.0 * PI * radius * radius * radius / 3;
	}

}

package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExFix01EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = ler.next();
		System.out.println("How many bedrooms are there in your house?");
		int bedr = ler.nextInt();
		System.out.println("Enter product price:");
		double price = ler.nextDouble();
		System.out.println("Enter your last name, age and height (same line)");
		String lname = ler.next();
		int age = ler.nextInt();
		double height = ler.nextDouble();
		
		System.out.println("------------------");
		System.out.println(name);
		System.out.println(bedr);
		System.out.println(price);
		System.out.println(lname);
		System.out.println(age);
		System.out.println(height);
		
		ler.close();
	}

}

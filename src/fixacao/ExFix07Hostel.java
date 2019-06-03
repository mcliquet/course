package fixacao;

import java.util.Locale;
import java.util.Scanner;

import entitiesFixacao.Rent;

public class ExFix07Hostel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			System.out.printf("Rent #%s:%n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i = 0 ; i < 10 ; i++ ) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		
		sc.close();

	}

}

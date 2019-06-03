package course;

import java.util.Scanner;

public class Comparativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 10;
		boolean c1 = a < 10; //false
		boolean c2 = a < 20; //true
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("-----------------------------");
		
		boolean c5 = a <= 10;
		boolean c6 = a >= 10;
		boolean c7 = a == 10;
		boolean c8 = a != 10;
		
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
		
		sc.close();

	}

}

package course;

import java.util.Scanner;

public class Condição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, high;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		high = 1;
		if (a > b) {
			high = a;
		}
		else if (b > c) {
			high = b;
		}
		else if (c > a){
			high = c;
		}
		
		System.out.println("The higher number is: " +high);
		System.out.println("-----------------------------");
		
		
		
		sc.close();
	}

}

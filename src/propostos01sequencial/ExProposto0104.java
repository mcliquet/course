package propostos01sequencial;

import java.util.Scanner;

public class ExProposto0104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numfunc, hours;
		double salary, salarytotal;
		
		numfunc = sc.nextInt();
		hours = sc.nextInt();
		salary = sc.nextDouble();
		
		salarytotal = hours * salary;
		
		System.out.println("Number = " +numfunc);
		System.out.printf("Salary = $%.2f", salarytotal);
		
		
		sc.close();

	}

}

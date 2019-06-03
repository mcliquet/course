package fixacao;

import java.util.Scanner;

import entitiesFixacao.Employee;

public class ExFix04Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s", employee);
		System.out.println();
		
		System.out.print("Wich percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
		
		
		sc.close();

	}

}

package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeOutsourced;

public class ProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// list do tipo employee, vai receber um arraylist
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextInt();
			if (ch == 'y') {
				System.out.print("additional charge: ");
				double additionalCharge = sc.nextDouble();
				// da pra fazer o new.... direto dentro do add(), n�o precisa Employee emp =
				// new...
				list.add(new EmployeeOutsourced(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS");

		// para cada funcion�rio emp da List list, vai:
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();

	}

}

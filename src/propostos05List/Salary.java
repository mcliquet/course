package propostos05List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import propostos05List.Employee;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		// part 1 reading data

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));// adiciona os dados digitados na lista
		}

		// part 2 - uodating salary

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		// procura na classe employee e coloca em emp
		// stream retorna o sequencial da lista
		// filter procura e retorna os elementos que constam na id
		// procura o primeiro com aquela id
		// se valor nao presente retorna orElse
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		// part 3 - listing emplyees

		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}

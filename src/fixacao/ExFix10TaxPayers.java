package fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesFixacao.Company;
import entitiesFixacao.Individual;
import entitiesFixacao.TaxPayers;

public class ExFix10TaxPayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			//como o name e anualIncome são comuns aos dois, da pra deixar de fora do for, se é melhor? não sei.
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpend = sc.nextDouble();
				//quando a superclasse for abstract, deve-se sempre declanar new subclasse
				list.add(new Individual(name, anualIncome, healthExpend));
			}
			if(ch == 'c') {
				System.out.print("Number of employees: ");
				int numberEmps = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmps));
			}
		}
		
		System.out.println();
		System.out.println("TAX PAID");
		double sum = 0.0;
		for(TaxPayers tp : list) {
			System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.taxPay()));
			sum += tp.taxPay();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $%.2f", sum);
		
		sc.close();
	}
}

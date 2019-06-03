package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ContaBancária {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account; // tem que declarar fora pra não ficar limitada ao if
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accName = sc.nextLine();
		
		System.out.print("Is there a initial deposit? (y/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit amount: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accNumber, accName, initialDeposit);
		}
		else {
			account = new Account(accNumber, accName);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account); //se não tiver tostring, imprime numero maluco
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Update data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update data:");
		System.out.println(account);
		
		sc.close();

	}

}

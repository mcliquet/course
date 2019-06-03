package course;

import entities.Account;
import entities.AccountSavings;

public class Polimorfismo {
	
	public static void main(String[] args) {
		//significa muitas formas,
		//muitas formas pra um mesmo tipo de variavel
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new AccountSavings(1023, "Maria", 1000, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		
	}

}

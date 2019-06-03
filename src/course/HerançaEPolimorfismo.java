package course;

import entities.Account;
import entities.AccountBusiness;
import entities.AccountSavings;

public class HerançaEPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1001, "Alex", 0.0);
		AccountBusiness baccount = new AccountBusiness(1002, "Maria", 0.0, 500.0);
		System.out.println(account);
		
		//UPCASTING
		Account account1 = baccount;
		System.out.println(account1);
		
		Account account2 = new AccountBusiness(1003, "Bob", 0.0, 200.0);
		Account account3 = new AccountSavings(1004, "Anna", 0.0, 0.01);
		
		System.out.println("=======================================");
		/*DOWNCASTING
		não pode converter de account pra business
		AccountBusiness account4 = account3;
		para forçar uma conversão da subclasse pra superclasse, tem de fazer manualmente
		*/
		AccountBusiness account4 = (AccountBusiness)account2;
		account4.loan(100.0);
		/*neste caso, a account foi instanciada como Savings e só dará problema ao executar
		AccountBusiness account5 = (AccountBusiness)account3;
		*/
		
		//este if falhou e pulou pro proximo
		if (account3 instanceof AccountBusiness) {
			AccountBusiness account5 = (AccountBusiness)account3;
			account5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (account3 instanceof AccountSavings) {
			//faz downcasting e o update do balance
			AccountSavings account5 = (AccountSavings)account3;
			account5.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println("=======================================");
		//==============================================
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//sobreposição feita
		Account acc2 = new AccountSavings(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		
		System.out.println("=======================================");
		//==============================================
		
		Account acc3= new AccountBusiness(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		

	}

}

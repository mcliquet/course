package entities;

//AccountBusiness derivada da classe Account, aproveita argumentos e métodos
public class AccountBusiness extends Account {
	// vai herdar o que tem na account comum
	private Double loanLimit;

	public AccountBusiness() {
		super();
	}

	public AccountBusiness(int accNumber, String accName, double initialDeposit, Double loanLimit) {
		// super usado pra superclasse, a qual esta aproveita os dados
		super(accNumber, accName, initialDeposit);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			accBalance += amount - 10;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		//iniciar a regra normal como a da superclasse e alterar mais
		super.withdraw(amount);
		accBalance -= 2.0;
	}

}

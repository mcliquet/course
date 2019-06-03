package entities;

//para evitar que sejam criadas subclasses de AccountSavings, tipo uma accountsavingplus
//deve-se alterar para
//public final class AccountSavings{
public class AccountSavings extends Account {
	private Double interestRate;
	
	public AccountSavings() {
		super();
	}

	public AccountSavings(int accNumber, String accName, double initialDeposit, Double interestRate) {
		super(accNumber, accName, initialDeposit);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		accBalance += accBalance * interestRate;
	}
	
	//caso não queirar que o método seja sobreposto, adicionar a palavra final também
	//public final void withdraw...
	@Override
	public void withdraw(double amount) {
		accBalance -= amount;
	}
	

}

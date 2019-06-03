package entities;

//usado em heran�aepolimorfismo e contasbanc�rias
//para garantir que em um banco, apenas contas poupan�a e empresarial sejam instanciadas, deve-se adicionar a classe abstract
//public abstract class Account{
public class Account {
	private int accNumber;
	private String accName;
	//private define que s� pode ser acessado pela sua classe
	//para tornar acess�vel por subclasse trocar pra protected
	protected double accBalance;

	//primeiro construtores
	public Account() {
	}

	public Account(int accNumber, String accName, double initialDeposit) {
		this.accNumber = accNumber;
		this.accName = accName;
		deposit(initialDeposit);
	}

	public Account(int accNumber, String accName) {
		this.accNumber = accNumber;
		this.accName = accName;
	}


	//segundo getters and setters
	public int getAccNumber() {
		return accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return accBalance;
	}

	public void deposit(double deposit) {
		this.accBalance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.accBalance -= withdraw + 5;
	}

	public String toString() {
		return "Number= " 
				+ accNumber 
				+ " Name= " 
				+ accName 
				+ " Balance= " 
				+ accBalance 
				+ ".";
	}

	
}

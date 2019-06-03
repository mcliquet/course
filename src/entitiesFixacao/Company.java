package entitiesFixacao;

public class Company extends TaxPayers{
	private Integer numberEmps;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberEmps) {
		super(name, anualIncome);
		this.numberEmps = numberEmps;
	}

	public Integer getNumberEmps() {
		return numberEmps;
	}

	public void setNumberEmps(Integer numberEmps) {
		this.numberEmps = numberEmps;
	}

	@Override
	public double taxPay() {
		if(numberEmps <= 10.0) {
			return anualIncome * 0.16;
		}
		else {
			return anualIncome * 0.14;
		}
		
	}

}

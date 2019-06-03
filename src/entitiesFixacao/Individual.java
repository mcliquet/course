package entitiesFixacao;

public class Individual extends TaxPayers{
	private Double healthExpend;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpend) {
		super(name, anualIncome);
		this.healthExpend = healthExpend;
	}
	
	public Double getHealthExpend() {
		return healthExpend;
	}

	public void setHealthExpend(Double healthExpend) {
		this.healthExpend = healthExpend;
	}

	@Override
	public double taxPay() {
		if (anualIncome < 20000) {
			return (anualIncome * 0.15) - (healthExpend * 0.5);
		}
		else {
			return (anualIncome * 0.25) - (healthExpend * 0.5);
		}
	}
	
	
	

}

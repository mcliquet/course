package entitiesFixacao;

public class ProductImported extends Product{
	private Double customsFee;
	
	public ProductImported() {
		super();
	}

	public ProductImported(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $" + String.format("%.2f", totalPrice()) + " (Custom fee: $" + customsFee + ")";
	}
	
	

}

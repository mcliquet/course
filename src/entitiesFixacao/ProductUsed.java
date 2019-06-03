package entitiesFixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductUsed extends Product{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Date manufactureDate;
	
	public ProductUsed() {
		super();
	}

	public ProductUsed(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + "(used) $" + price + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
	

}

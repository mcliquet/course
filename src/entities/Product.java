package entities;

public class Product {
	
	//para encapsular os atributos, � preciso passar de public pra private
	private String name;
	private double price;
	private int quantity;
	
	//poss�vel incluir tamb�m construtor padr�o
	public Product() {
	}
	
	//obrigar objeto um construtor para que n�o comece nulo
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0; //opcional, ja inicia com 0 por padr�o
	}	
	
	
	//metodo de set e get � colocado depois dos construtores
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; // this � autorefer�ncia para o atributo da classe, quantity principal
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}

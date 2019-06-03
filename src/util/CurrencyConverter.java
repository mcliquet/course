package util;

public class CurrencyConverter {
	public static double dollPrice;
	public static double dollAmount;
	
	public static double amountPaid() {
		return dollAmount * dollPrice * 1.06;
	}
	

}

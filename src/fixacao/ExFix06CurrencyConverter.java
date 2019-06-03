package fixacao;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ExFix06CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dollAmount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in Reais = %.2f", CurrencyConverter.amountPaid());
		
		sc.close();

	}

}

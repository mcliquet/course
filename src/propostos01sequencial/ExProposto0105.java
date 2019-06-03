package propostos01sequencial;

import java.util.Scanner;

public class ExProposto0105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, numPeca1, numPeca2;
		double valUniPeca1, valUniPeca2, totPagar;
		
		System.out.println("1- Código, Quantidade e valor:");
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valUniPeca1 = sc.nextDouble();
		System.out.println("2- Código, Quantidade e valor:");
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valUniPeca2 = sc.nextDouble();
		
		totPagar = ( numPeca1 * valUniPeca1 ) + ( numPeca2 * valUniPeca2 );
		
		System.out.printf("Você deve pagar R$%.2f.", totPagar);
		System.out.println("itens: " +codPeca1 +codPeca2);
		
		sc.close();
				

	}

}

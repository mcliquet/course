package propostos01sequencial;

import java.util.Scanner;

public class ExProposto0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Vamos calcular a �rea do c�rculo:");
		System.out.println("Qual o raio deste c�rculo?");
		
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A �rea deste c�rculo � de: %.4f m�", area);
		
		sc.close();

	}

}

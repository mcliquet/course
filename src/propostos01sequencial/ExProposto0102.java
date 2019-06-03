package propostos01sequencial;

import java.util.Scanner;

public class ExProposto0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Vamos calcular a área do círculo:");
		System.out.println("Qual o raio deste círculo?");
		
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A área deste círculo é de: %.4f m²", area);
		
		sc.close();

	}

}

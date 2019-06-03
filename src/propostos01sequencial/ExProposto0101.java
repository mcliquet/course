package propostos01sequencial;

import java.util.Scanner;

public class ExProposto0101{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, soma;
		
		System.out.println("Entre com o primeiro valor para somar:");
		valor1 = sc.nextInt();
		System.out.println("Entre com o segundo valor para somar:");
		valor2 = sc.nextInt();
		soma = valor1 + valor2;
		System.out.println("A soma dos valores é: " +soma);
		
		sc.close();
	}

}

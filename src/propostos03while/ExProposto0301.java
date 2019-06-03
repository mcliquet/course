package propostos03while;

import java.util.Scanner;

public class ExProposto0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		System.out.println("Entre com a senha:");
		int ler = sc.nextInt();
		
		while (ler != senha) {
			System.out.println("Senha incorreta!");
			System.out.println("Tente outra vez:");
			ler = sc.nextInt();
		}
		
		System.out.println("Parabéns!");
		
		sc.close();
	}

}

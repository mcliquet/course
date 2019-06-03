package propostos03while;

import java.util.Scanner;

public class ExProposto0303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1.Álcool
		int alc = 0;
		// 2.Gasolina
		int gas = 0;
		// 3.Diesel
		int die = 0;
		// 4.Fim
		
		int cod = sc.nextInt();
		
		while (cod != 4) {
			
			switch (cod) {
			case 1:
				alc = alc + 1;
				break;
			case 2:
				gas = gas + 1;
				break;
			case 3:
				die = die + 1;
				break;
			case 4:
				break;
			}
			cod = sc.nextInt();
			
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);

		sc.close();

	}

}

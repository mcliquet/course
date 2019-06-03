package propostos02condicional;

import java.util.Scanner;

public class ExProposto0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hora1, hora2, tempo;
		
		hora1 = sc.nextInt();
		hora2 = sc.nextInt();
		
		if (hora1 < hora2) {
			tempo = hora2 - hora1;
		}
		else {
			tempo = 24 - hora1 + hora2;
		}
		
		System.out.printf("O jogo durou %s horas.", tempo);
		
		
		sc.close();

	}

}

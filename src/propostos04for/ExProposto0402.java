package propostos04for;

import java.util.Scanner;

public class ExProposto0402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int qtdN = sc.nextInt();
		int in = 0, out = 0;
		
		for (int i = 1; i <= qtdN; i++ ) {
			int num = sc.nextInt();
			
			if (num >= 10 && num < 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in.");
		System.out.println(out + " out.");
		
		sc.close();
		

	}

}

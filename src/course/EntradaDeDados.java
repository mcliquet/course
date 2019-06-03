package course;

import java.util.Locale;
import java.util.Scanner;


public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int n1 = ler.nextInt();
		//se der quebra de linha anteriormente, é preciso chamar um nextline vazio anteriormente.
		ler.nextLine();
		String name = ler.nextLine(); 
		char gender = ler.next().charAt(0);
		String s = ler.next();
		char letter = s.charAt(0);
		//recortar string a começando na posição 1
		int digit = Integer.parseInt(s.substring(1)); 
		//ler double 4.32
		double n2 = ler.nextDouble();
		// ler variaveis diferentes na mesma linha
		// maria f 23 1.68
		String name2 = ler.next(); //ler palavra
		char ch = ler.next().charAt(0); //ler a letra na posição 0
		int age = ler.nextInt(); //ler o inteiro
		double height = ler.nextDouble(); //ler o double
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		
		System.out.println("---------------------");
		System.out.println("Digite uma frase.");
		String frase = ler.nextLine(); 
		System.out.println("Repetindo");
		System.out.println(frase);
		
		System.out.println("---------------------");
		System.out.println("Digite 3 palavras.");
		String x, y, z;
		x = ler.next(); //também lê palavras na mesma linha, separadas por espaço.
		y = ler.next();
		z = ler.next();
		System.out.println("Repetindo");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		ler.close();
	}

}

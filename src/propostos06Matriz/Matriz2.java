package propostos06Matriz;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//ler tamanho da matriz
		System.out.print("How many lines will be? ");
		int line = sc.nextInt();
		System.out.print("How many columns will be? ");
		int column = sc.nextInt();
		
		//instanciar uma matriz com numeros determinados
		//pelo leitor
		int[][] mat = new int[line][column];
		
		System.out.println("Start filling");
		//preencher a matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Choose a number to be found: ");
		int find = sc.nextInt();
		
		//mat[i][j] = valor nessa posição
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == find) {
					System.out.println("Position: " + i + "," + j + ".");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		sc.close();

	}

}

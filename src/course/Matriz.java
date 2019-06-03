package course;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //instancia a matriz na memória

		// serve pra percorrer a matriz colocando os dados linha por linha
		for (int i = 0; i < mat.length; i++) { 			//percorre linha
			for (int j = 0; j < mat[i].length; j++) { 	//percorre coluna
				mat[i][j] = sc.nextInt();
			}
		}

		//mostrar a diagonal principal
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		//contador de numeros negativos, deve percorrer toda matriz.
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		sc.close();
	}

}

package fixacao;

import java.util.Scanner;

import entitiesFixacao.Aluno;

public class ExFix05Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade= %.2f%n", aluno.finalGrade());
		
		if (aluno.finalGrade() >= 60) {
			System.out.println("Pass!");
		}
		else {
			double need = 60 - aluno.finalGrade();
			System.out.printf("Missing %.2f points.", need);
		}
		
		sc.close();

	}

}

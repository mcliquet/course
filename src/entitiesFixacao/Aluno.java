package entitiesFixacao;

public class Aluno {
	
	public String name;
	public double nota1, nota2, nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	

}

package course;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//&& E só quando 2 V = V
		//|| OU apenas 1 V = V
		//! não
		//precedencia ! > && > ||
		
		
		boolean c1 = 2 > 3 || 4 != 5;
		boolean c2 = !(2 > 3);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("----------------------------");
		
		boolean c3 = 10 < 5; //false
		boolean c4 = c1 || c2 && c3; 
		
		System.out.println(c4);
		

	}

}

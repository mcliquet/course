package course;

public class Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = 10.0 / 8.0;
		
		double a = 1.0, b = -3.0, c = -4.0; 
		double baskara = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		System.out.println(baskara);
		
	}

}
package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoTryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "E:\\Programa��o\\Eclipse\\course\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		

	}

}

package course;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		String path = "E:\\Programação\\Eclipse\\course\\out.txt";
		//se colocar true no file writer ele não reescreve o arquivo, apenas o completa
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

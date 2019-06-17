package propostos07TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import propostos07TrabalhandoComArquivos.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		String pathIn = "E:\\Programação\\Eclipse\\course\\source.csv";
		String pathOut = "E:\\Programação\\Eclipse\\course\\out.csv";

		List<Product> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {

			String line = br.readLine();

			while (line != null) {
				//System.out.println(line);
				//line = br.readLine();
				String[] parts = line.split(", ");
				String name = parts[0];
				double price = Double.parseDouble(parts[1]);
				int quantity = Integer.parseInt(parts[2]);
				
				list.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
				
				for (Product product : list) {
					bw.write(product.getName() + ", " + String.format("%.2f", product.totalPrice()));
					bw.newLine();
				}
				
				System.out.println("Created!");
			
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

	}

}

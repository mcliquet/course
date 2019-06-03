package fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entitiesFixacao.Product;
import entitiesFixacao.Client;
import entitiesFixacao.Order;
import entitiesFixacao.OrderItem;

public class ExFix08Order {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//entrada dos dados do cliente
		System.out.printf("Enter client data: \n");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Bith date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		//entrando com os dados do pedido
		System.out.println("Enter order data: ");
		System.out.print("Status: \n");
		
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many itens to this order? ");
		int n = sc.nextInt();
		//entrando com cada item e quantidade do pedido
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:\n");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			
			Product product = new Product(pName, pPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, pPrice, product);
			
			order.addItem(item);
		}
		
		//resumo dos dados do pedido
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		sc.close();
		
	}

}

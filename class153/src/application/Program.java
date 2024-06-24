package application;
import Enum.OrderStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birth = sc.next();
		LocalDate birthDate = LocalDate.parse(birth, formatter);
		
		Client client = new Client(name, email,birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusString = sc.next();
		OrderStatus status = OrderStatus.valueOf(statusString.toUpperCase());
		LocalDateTime moment = LocalDateTime.now();
		
		Order order = new Order(moment, status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter #%d item data\n", i+1);
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName, price);
			OrderItem orderItem = new OrderItem(quantity, price, product );
			order.addItem(orderItem);
		}
		
		
		System.out.println(order.toString());
		

		
		
		
		
		

		
		sc.close();
	}

}

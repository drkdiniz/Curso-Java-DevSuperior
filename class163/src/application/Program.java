package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> prod = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data:", i + 1);
			System.out.print("Common, used or importes (c/u/i)? ");
			String cui = sc.next();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (cui.equalsIgnoreCase("c")) {
				prod.add(new Product(name, price));
			}
			else if (cui.equalsIgnoreCase("u")) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				LocalDate manufactureDate = LocalDate.parse(date, formatter);
				prod.add(new UsedProduct(name, price, manufactureDate));
			}
			else if (cui.equalsIgnoreCase("i")) {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				prod.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : prod) {
			System.out.printf(p.priceTag());
		}
		sc.close();
	}
	
}
		
		
		
		
		
		
		

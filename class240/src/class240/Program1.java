package class240;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import services.CalculationService;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\drkdi\\OneDrive\\Área de Trabalho\\PROJETOS\\in.txt";
				
		 		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {		
			String line = br.readLine();
			while (line != null) {
				String[] aux = line.split(",");
				list.add(new Product(aux[0], Double.parseDouble(aux[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.print("Most expensive: " + x);
			
		
					
				 
			
			
		
		
		
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}

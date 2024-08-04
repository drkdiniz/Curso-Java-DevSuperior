package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\drkdi\\Desktop\\WS\\in.txt";
		List<Employee> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String file = br.readLine();
			while (file != null) {
				String[] aux = file.split(",");
				list.add(new Employee(aux[0], aux[1], Double.parseDouble(aux[2])));
				file = br.readLine();
				
				}
			System.out.print("Enter salary: ");
			double sal = sc.nextDouble();
			System.out.printf("Email of people whose salary is more than %.2f\n", sal);
			
			List<Employee> emp = list.stream().filter(p -> p.getSalary() > sal)
				.sorted(Comparator.comparing(Employee::getEmail))
				.collect(Collectors.toList());
			
			emp.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y)-> x + y) ;
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f\n", sum);
			
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

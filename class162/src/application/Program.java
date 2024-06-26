package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d data: ", i + 1);
			System.out.print("Outsourced(y/n)? ");
			String outsourced = sc.next();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (outsourced.equalsIgnoreCase("N")) {
				emp.add(new Employee(name, hours, valuePerHour ));
			}
			else {
				System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                emp.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
		}
		System.out.println("PAYMENTS: ");
		for (Employee employee : emp) {
			System.out.printf("%s - $ %.2f\n", employee.getName(), employee.payment() );
		}
		
		
	sc.close();	
	}
	
}
				
		
		
		

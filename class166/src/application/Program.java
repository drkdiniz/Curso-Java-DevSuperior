package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data:\n", i);
			System.out.print("Individual or Company (i/c)? ");
			String ic = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			
			if (ic.equalsIgnoreCase("i")) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of Eemployees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer payer : list) {
			System.out.printf("%s: $ %.2f\n", payer.getName(), payer.tax());
		}
		double sum = 0.0;
		for (TaxPayer payer : list) {
			sum += payer.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + sum);

		
		sc.close();
	}

}

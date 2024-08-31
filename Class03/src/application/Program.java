package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Exployee e = new Exployee();
		
		System.out.print("What is the employee's name?: ");
		e.setName(input.nextLine());
		
		System.out.print("What is their gross salary?: ");
		e.setGrossSalary(input.nextDouble());
		
		System.out.print("How much tax?: ");
		e.setTax(input.nextDouble());
		
		System.out.println(e.toString());
		
		System.out.print("Which percentage to increase salary?: ");
		e.increaseSalary(input.nextDouble());
		
		
		
		

		input.close();
	}

}

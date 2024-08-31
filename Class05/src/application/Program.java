package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the Dollar price? ");
		double dollar = input.nextDouble();
		
		System.out.print("How manny Dollars will be bought? ");
		double quant = input.nextDouble();
		
		double totalEmReais = CurrencyConverter.converterDollar(dollar, quant);
		System.out.printf("Amond to be paid in reais = %.2f", totalEmReais);
		
		input.close();

	}

	
		
	}



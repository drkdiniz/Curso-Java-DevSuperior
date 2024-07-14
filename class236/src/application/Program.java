package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		InterestService is1 = new UsaInterestService(1.0);
		double payment1 = is1.payment(amount, months);
		
		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", payment));
		System.out.println();
		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", payment1));
		
		
		sc.close();

	}

}

package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Program {
	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter account data");
				System.out.print("Number: ");
				int number = sc.nextInt();
				sc.nextLine();
				System.out.print("Holder: ");
				String holder = sc.nextLine();
				System.out.print("Initial balance: ");
				double balance = sc.nextDouble();
				System.out.print("Withdraw Limit: ");
				double withdrawLimit = sc.nextDouble();
				
				Account acc = new Account(number, holder, balance, withdrawLimit);
				
				System.out.print("Enter amount for withdraw:");
				double n = sc.nextDouble();
				acc.withdraw(n);
				
			}
			catch (InputMismatchException e) {
				System.out.println("Input error: You have entered incorrect data.");
			}
			catch (DomainException e) {
				System.out.println(e.getMessage());
			}
			finally {
				sc.close();
			}
			
			
			
			
			
			
	}
}

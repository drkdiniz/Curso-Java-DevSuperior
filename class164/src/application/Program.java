package application;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account x = new Account(1001, "Derek", 1000.0);
		Account y = new SavingAccount(1002, "Maria", 1000.0, 500.0);
		Account z = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		System.out.println(z.getBalance());
		
		
		sc.close();
	}

}
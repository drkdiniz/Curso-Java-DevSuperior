package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;


public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Derek", 1000.0);
		Account aacc = new SavingAccount(1002, "Maria", 1000.0, 500.0);
		Account bacc = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		
		acc.withdraw(100);
		System.out.println(acc.getBalance());
		
		aacc.withdraw(100);
		System.out.println(aacc.getBalance());
		
		bacc.withdraw(100);
		System.out.println(bacc.getBalance());
	
	}

}

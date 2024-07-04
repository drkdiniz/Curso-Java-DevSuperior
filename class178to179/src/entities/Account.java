package entities;

import exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException{
		if (balance < 0.0) {
			throw new DomainException("The balance cannot be less than 0.");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) throws DomainException{
		if (amount <= 0.0) {
			throw new DomainException("This amount is not valid for deposits."); 
		}
		balance += amount;
		
	}
	public void withdraw(double amount) throws DomainException{
		if (amount > withdrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		if (amount <= 0.0) {
			throw new DomainException("This amount is not valid for deposits."); 
		}
		balance -= amount;
		System.out.printf("New balance: %.2f", balance);
		
	}
	
	
	
}

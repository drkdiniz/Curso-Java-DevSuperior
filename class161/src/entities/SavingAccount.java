package entities;

public class SavingAccount extends Account {
	private double interestRate;

	public SavingAccount() {
		super();
		
	}

	public SavingAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += interestRate;
	}
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	
	}
	
}

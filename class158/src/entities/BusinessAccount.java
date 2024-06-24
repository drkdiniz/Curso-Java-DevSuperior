package entities;

public class BusinessAccount extends Account{
	private double loanlimite;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, double loanlimite) {
		super(number, holder, balance);
		this.loanlimite = loanlimite;
	}

	public double getLoanlimite() {
		return loanlimite;
	}

	public void setLoanlimite(double loanlimite) {
		this.loanlimite = loanlimite;
	}
	
	public void loan(double amount) {
		if (amount <= loanlimite) {
			balance += amount;
		}
	}
	
	
	
}

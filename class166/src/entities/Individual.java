package entities;

public class Individual extends TaxPayer{
	private double healthExpenditures;
	
	
	public Individual() {
		
	}
	
	public Individual(String name, Double annualIncome, double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double imp;
		if (super.getAnnualIncome() < 20000) {
			imp = super.getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			imp = super.getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
		return imp;
	}
	
	

	
	
	
	
}

package entities;

public class Company extends TaxPayer{
	private int numberOfEmployees;
	
	
	public Company() {
		
	}
	public Company(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	@Override
	public double tax() {
		double imp;
		if (numberOfEmployees <= 10) {
			imp = super.getAnnualIncome() * 0.16;
		}
		else {
			imp = super.getAnnualIncome() * 0.14;
		}
		return imp;
	}
	
}

	

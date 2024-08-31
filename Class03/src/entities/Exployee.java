package entities;

public class Exployee {
	private String name;
	private double grossSalary;
	private double tax;
	
	
	public double netSalary() {
		double result = this.grossSalary - this.tax;
		return result;
	}
	
	public void increaseSalary(double percentage) {
		System.out.println();	
		if (percentage > 0) {
				double result = (this.grossSalary + (this.grossSalary * percentage / 100) - this.tax);
				System.out.printf("Update data : %s , $ %.2f\n", name, result);
		}
		else {
			System.out.println("the percentage value must be greater than zero");
		}			
			
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	@Override
	public String toString() {
		return "\nEmployee = " + this.getName()
		+ ", $ "
		+ String.format("%.2f\n", netSalary());
	}
	
	
	
	
	

	
}
	
	
	
	
	


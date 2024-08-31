package entities;


public class Students {
	private String name;
	private double at1;
	private double at2;
	private double at3;
	private boolean approval;
	
	
	public double finalGrade() {
		double weightAt1 = 30;
		double weightAt2 = 35;
		double weightAt3 = 35;
		double result = ((this.getAt1() * weightAt1) + (this.getAt2() * weightAt2) + (this.getAt3() * weightAt3)) / (weightAt1 + weightAt2 + weightAt3);
		return result;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAt1() {
		return at1;
	}

	public void setAt1(double at1) {
		this.at1 = at1;
	}

	public double getAt2() {
		return at2;
	}

	public void setAt2(double at2) {
		this.at2 = at2;
	}

	public double getAt3() {
		return at3;
	}

	public void setAt3(double at3) {
		this.at3 = at3;
	}

	public boolean isApproval() {
		return approval;
	}

	public void setApproval() {
		
		if (finalGrade() >= 60) {
			this.approval = true;
			
		}
		else {
			this.approval = false;
			
		}
		
		
	}

	public double missingPoints() {
        if (approval) {
            return 0;
        } else {
            return 60.0 - finalGrade();
        }
	}
	
	@Override
	public String toString() {
	    String result = "FINAL GRADE: " + String.format("%.2f", finalGrade());
	    if (this.approval) {
	        result += "\nPASS";
	    } else {
	        result += "\nFAILED";
	        result += String.format("\nMISSING %.2f POINTS.", missingPoints());
	    }
	    return result;
	}

	
	
	
	
}

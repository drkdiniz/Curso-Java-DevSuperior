package entities;

public class Rectangle {
	private double width;
	private double height;
	
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return (this.width + this.height) * 2;
	}
	
	public double diagonal() {
		double result = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return result;
	}
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "AREA = " + String.format("%.2f\n", area()) 
		+ "PERIMETER = " + String.format("%.2f\n", perimeter())
		+ "DIAGONAL = " + String.format("%.2f\n", diagonal());
		
		
	}
	
	
	
}
	
	
	
	
	
	
	

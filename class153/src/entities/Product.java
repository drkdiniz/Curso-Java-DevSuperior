package entities;

public class Product {
	private String productName;
	private double price;
	
	public Product() {
		
	}

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

	public String getName() {
		return productName;
	}

	public void setName(String name) {
		this.productName = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name =" + String.format(" %s\n", productName) + 
				"price =" + String.format(" %.2f", price);
	}
		
	
}

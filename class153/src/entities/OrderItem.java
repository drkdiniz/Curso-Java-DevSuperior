package entities;



public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product products) {
		this.quantity = quantity;
		this.price = price;
		this.product = products;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	public Product getProduct() {
		return product;
	}


	public double SubTotal() {
		return product.getPrice() * this.quantity;
	}

	@Override
	public String toString() {
		return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f",
                product.getName(), product.getPrice(), quantity, SubTotal());
	}	
	
	
	
	
}

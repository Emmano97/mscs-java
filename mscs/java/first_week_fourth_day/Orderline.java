package mscs.java.first_week_fourth_day;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Orderline {
	
	private int quantity;
	private double price;
	private String status;
	private LocalDateTime shipDate;
	private double points;
	private ArrayList<Product> products;

	public Orderline(int quantity, double price, String status, LocalDateTime shipDate, double points) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.shipDate = shipDate;
		this.points = points;
		this.products = new ArrayList<Product>();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDateTime shipDate) {
		this.shipDate = shipDate;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
		this.products.add(product);
	}

	public double computePrice() {
		double totalPrice = 0;
		if(products!=null && !products.isEmpty()) {
			for(Product product: products) {
				totalPrice += product.getPrice();
			}
		}
		return totalPrice;
	}
	
	public double computePoints() {
		double totalPoints = 0;
		if(products!=null && !products.isEmpty()) {
			for(Product product: products) {
				totalPoints += product.getPoints();
			}
		}
		return totalPoints;
	}


}

package mscs.java.first_week_fourth_day;

import java.util.ArrayList;

public abstract class ACustomer implements ICustomer {
	private String name;
	private String address;
	private String phone;
	private double points;
	private ArrayList<Order> orders;
	
	
	
	
	public ACustomer(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public double getPoints() {
		return points;
	}



	public void setPoints(double points) {
		this.points = points;
	}



	public ArrayList<Order> getOrders() {
		return orders;
	}



	public void addOrders(Order order) {
		this.orders.add(order);
	}



	public abstract double getCreditRating();
	
}

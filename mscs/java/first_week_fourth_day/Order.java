package mscs.java.first_week_fourth_day;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
	private String orderNumber;
	private boolean prepaid;
	private double orderPrice;
	private LocalDateTime orderDate;
	private String  status;
	private ArrayList<Orderline> orderlines;

	public Order(String orderNumber, boolean prepaid, double orderPrice, LocalDateTime orderDate, String status) {
		super();
		this.orderNumber = orderNumber;
		this.prepaid = prepaid;
		this.orderPrice = orderPrice;
		this.orderDate = orderDate;
		this.status = status;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}

	public double getTotalPrice() {
		return 0;
	}
	
	public boolean getPrepaid() {
		return prepaid;
	}
	
	public double getCustomerPoints() {
		return 0;
	}
	
	public ArrayList<Orderline> getOrderlines() {
		return orderlines;
	}

	public void addOrderlines(Orderline orderline) {
		this.orderlines.add(orderline);
	}
	
	public double getOrderPoints() {
		double totalPoints = 0;
		if(orderlines!=null && !orderlines.isEmpty()) {
			for(Orderline orderline: orderlines) {
				totalPoints += orderline.getPoints();
			}
		}
		return totalPoints;
	}

	
}

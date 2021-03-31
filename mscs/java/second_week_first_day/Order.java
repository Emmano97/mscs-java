package mscs.java.second_week_first_day;

import java.time.LocalDateTime;

public class Order implements IStudent{
	private static  int defaultOrderNo = 0;
	private int orderNo;
	private LocalDateTime orderDate;
	private double orderAmount;

	Order(){
		defaultOrderNo += 1;
		orderNo = defaultOrderNo;
		orderDate = LocalDateTime.now();
		orderAmount = 0;
	}
	
	Order(double orderAmount){
		defaultOrderNo += 1;
		orderNo = defaultOrderNo;
		orderDate = LocalDateTime.now();
		this.orderAmount = orderAmount;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	@Override
	public void printStudent() {
		System.out.println();
	}
	
	
	

}

package mscs.java.second_week_first_day;

import java.util.ArrayList;

public class Commissioned extends Employee {

	
	private double commission;
	private double baseSalary;
	private ArrayList<Order> orders;
	
	public Commissioned(double commision, double baseSalary) {
		super();
		this.commission = commision;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<Order>();
	}
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	@Override
	double calcGrossPay(DateRange dateRange) {
		
		double total = baseSalary;
		
		if(orders!=null & !orders.isEmpty()) {
			for(Order order: orders) {
				//if()
				total += (order.getOrderAmount() * commission)/100;
			}
		}
		
		return total;
	}

}

package mscs.java.second_week_first_day;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Employee {
	private static int defaultId = 0;
	private int employeeId;


	private ArrayList<Paycheck> paychecks;
	
	public Employee() {
		defaultId += 1;
		this.employeeId  = defaultId;
		paychecks = new ArrayList<Paycheck>();
		
	}
	
	public void addPaycheck(Paycheck paycheck) {
		this.paychecks.add(paycheck);
	}
	
	public void print() {
		
	}
	
	public Paycheck calcCompensation(int month, int year){
		
		LocalDateTime startDate = LocalDateTime.of(year, month, 0, 0, 0); 
		
		DateRange dateRange = new DateRange(startDate);
		
		double grossPay = calcGrossPay(dateRange);
		
		double fica = (grossPay * Tax.FICA.getValue())/100;
		
		double state_tax = (grossPay * Tax.STATE_TAX.getValue())/100;
		
		double local_tax = (grossPay * Tax.LOCAL_TAX.getValue())/100;
		
		double medicare = (grossPay * Tax.MEDICARE.getValue())/100;
		
		double social_security = (grossPay * Tax.SOCIAL_SECURITY.getValue())/100;
		
		return new Paycheck(grossPay, fica, state_tax, local_tax, medicare, social_security, dateRange);

	}
	
	abstract double calcGrossPay(DateRange dateRange);
	
	public int getEmployeeId() {
		return employeeId;
	}

}

package mscs.java.first_week_fourth_day;

public class CorporateCustomer extends ACustomer {
	
	private double  creditRating;
	
	private String creditLimit;
	
	public CorporateCustomer(String name, String address, String phone) {
		super(name, address, phone);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getCreditLimit() {
		return creditLimit;
	}



	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}



	public void setCreditRating(double creditRating) {
		this.creditRating = creditRating;
	}



	@Override
	public double getCreditRating() {
		return creditRating;
	}
	
	public void generateMonthlyBill() {
		
	}

}

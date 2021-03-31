package mscs.java.second_week_first_day;

public class Paycheck {
	
	private double grossPay;
	
	private double fica;
	
	private double state;
	
	private double local;
	
	private double medicare;
	
	private double socialSecurity;
	
	private DateRange payPeriod;
	
	public Paycheck() {
		
	}
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
	}
	
	

}

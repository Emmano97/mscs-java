package mscs.java.first_week_third_day;

public class SeniorDiscount extends ADiscount {
	
	SeniorDiscount(){
		super();
		discount = 15;
	}

	@Override
	public double getDiscount() {
		return discount;
	}
}

package mscs.java.first_week_third_day;

public class StudentDiscount extends ADiscount {
	
	StudentDiscount(){
		super();
		discount = 10;
	}

	@Override
	public double getDiscount() {
		return discount;
	}
}

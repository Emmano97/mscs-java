package mscs.java.first_week_third_day;

public enum Zone {
	
	IA(0.35),
	MT (0.35),
	OR(0.35),
	CA(0.35),
	TX(0.30),
	UT(0.30),
	FL(0.55),
	MA(0.55),
	OH(0.55),
	OTHERS(0.43);
	
	double price;

	private Zone(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}

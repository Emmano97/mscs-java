package mscs.java.first_week_third_day;

public class Ups extends ShippingCarrier {
	
	
	private double weight;
	private String name;
	private static double fixRate = 0.45 ;
	
	public Ups(double weight, String name) {
		super();
		this.weight = weight;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getFixRate() {
		return fixRate;
	}

	public void setFixRate(double fixRate) {
		this.fixRate = fixRate;
	}

	@Override
	public double getRate() {
		return fixRate * weight;
	}

}

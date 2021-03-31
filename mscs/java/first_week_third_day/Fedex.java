package mscs.java.first_week_third_day;

public class Fedex extends ShippingCarrier {

	private Zone zone;
	private double weight;
	private String name;
	
	public Fedex(Zone zone, double weight, String name) {
		super();
		this.zone = zone;
		this.weight = weight;
		this.name = name;
	}

	@Override
	public double getRate() {
		return zone.getPrice() * weight;
	}
}

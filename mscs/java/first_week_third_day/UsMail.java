package mscs.java.first_week_third_day;

public class UsMail extends ShippingCarrier {
	
	private double weight;
	private String name;
	
	public UsMail(double weight, String name) {
		super();
		this.weight = weight;
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getRate() {
		double result;
		if(weight < 3) {
			result = 1;
		}else {
			result = 0.55 * weight;
		}
		return result;
		
	}

}

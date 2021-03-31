package mscs.java.first_week_fourth_day;

public class Product implements IProduct, ICompPoints {
	private String description;
	private int productNumber;
	private double price;
	
	
	@Override
	public double getPrice() {
		return price;
	}


	@Override
	public double getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

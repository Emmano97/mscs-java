package mscs.java.second_week_first_day;

public class Hourly extends Employee {

	private int hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(int hourlyWage, int hoursPerWeek) {
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	double calcGrossPay(DateRange dateRange) {
		int  numberOfWeek = 2;
		return hourlyWage * hoursPerWeek * numberOfWeek;
	}

}

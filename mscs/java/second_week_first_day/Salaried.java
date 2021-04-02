package mscs.java.second_week_first_day;

public class Salaried extends Employee {

	
	private double salary;
	
	public Salaried(int salary) {
		super();
		this.salary = salary;
	}
	

	
	@Override
	double calcGrossPay(DateRange dateRange) {
		int totalMonth = 2;
		return this.salary * totalMonth;
				
	}

}

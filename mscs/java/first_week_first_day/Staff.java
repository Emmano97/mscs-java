package mscs.java.first_week_first_day;

public class Staff extends Person {
	
	private double salary;
	
	Staff(){
		super();
		this.salary = 0;
	}
	
	Staff(String name, String phone, int age, double salary){
		super(name, phone, age);
		this.salary = salary;
	}
	
	Staff(String name, String phone, int age){
		super(name, phone, age);
		this.salary = 0;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

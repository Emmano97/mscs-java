package mscs.java.first_week_second_day;

import java.util.Date;

public class Employee {
	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date birthDate;
	private String ssn;
	private double salary;
	private Position position;
	
	
	
	public Employee(int employeeId, 
			String firstName,
			String middleName,
			String lastName,
			Date birthDate,
			String ssn,
			double salary, 
			Position position) {
		
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.ssn = ssn;
		this.salary = salary;
		this.position = position;
		position.setEmployee(this);
	}

	Employee(){
		//position = new Position();
	}
	
	public void print() {
		System.out.println("--------------Employee----------");
		System.out.printf("\nFirstName: %s \n", firstName);
		System.out.printf("\nmiddleName: %s \n", middleName);
		System.out.printf("\nlastName: %s \n", lastName);
		System.out.println("--------------------------------");
	}
	
	public double getSalary() {
		return salary;
	}
	

}

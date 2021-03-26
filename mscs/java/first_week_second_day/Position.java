package mscs.java.first_week_second_day;

public class Position {
	private String title;
	private  String description;
	private Department department;
	private Employee employee;
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	Position(){
		title = "";
		description = "";
		this.employee = new Employee();
	}
	
	Position(String title, String description){
		this.title = title;
		this.description =  description;
		this.employee = new Employee();
	}
	
	Position(String title, String description, Employee employee){
		this.title = title;
		this.description =  description;
		this.employee = employee;
	}
	
	public void print() {
		System.out.println("*********** Position ***********");
		System.out.printf("\nTitle: %s \n \nDescription: %s \n", title, description);
		if(department!=null)
			System.out.printf("\nDepartment: %s \n", department.getName());
		
		if(employee!=null)
			employee.print();
	}
	
	public double getSalary() {
		if(employee!=null)
			return employee.getSalary();
		return 0;
	}
	

}

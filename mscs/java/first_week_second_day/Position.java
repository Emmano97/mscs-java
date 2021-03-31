package mscs.java.first_week_second_day;

import java.util.LinkedList;

public class Position {
	private String title;
	private  String description;
	private Department department;
	private Employee employee;
	private Position superior;
	private LinkedList<Position> inferiors;
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	Position(){
		title = "";
		description = "";
		this.employee = new Employee();
		inferiors = new LinkedList<Position>();
	}
	
	Position(String title, String description){
		this.title = title;
		this.description =  description;
		this.employee = new Employee();
		superior = new Position();
		inferiors = new LinkedList<Position>();
	}
	
	Position(String title, String description, Employee employee){
		this.title = title;
		this.description =  description;
		this.employee = employee;
		superior = new Position();
		inferiors = new LinkedList<Position>();
	}
	
	public void print() {
		System.out.println("*********** Position ***********");
		System.out.printf("\nTitle: %s \n \nDescription: %s \n", title, description);
		if(department!=null)
			System.out.printf("\nDepartment: %s \n", department.getName());
		
		if(employee!=null)
			employee.print();
	}
	
	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}
	
	
	public void addInferior(Position position) {
		this.inferiors.add(position);
	}
	
	public double getSalary() {
		if(employee!=null)
			return employee.getSalary();
		return 0;
	}
	
	public boolean isManager() {
		return true;
	}
	
	public void printDownLine() {
		print();
		System.out.println("*********** Superior ***********");
		if(superior!=null)
			superior.print();
		
		System.out.println("*********** Inferiors ***********");
		
		if(inferiors!=null && !inferiors.isEmpty()) {			
			for(Position position: inferiors) {
				System.out.println();
				System.out.print("\t\t");
				position.printDownLine();
				
			}
		}
	}


}

package mscs.java.first_week_second_day;

import java.util.ArrayList;

public class Company {
	private  String name;
	ArrayList<Department> departments;
	
	Company(){
		name = "";
		departments = new ArrayList<Department>();
	}
	
	Company(String name){
		this.name = name;
		departments = new ArrayList<Department>();
	}
	
	Company(String name, ArrayList<Department> departments){
		name = "";
		this.departments = departments;
	}
	
	public void addDepartment(Department department) {
		this.departments.add(department);
	}
	
	public void print() {
		
	}
}

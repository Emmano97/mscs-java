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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	public void addDepartment(Department department) {
		this.departments.add(department);
	}
	
	public void print() {
		System.out.println("############# Company ###########");
		System.out.printf("\nName: %s \n", name);
		
		
		if(departments!=null && !departments.isEmpty()) {			
			for(Department department: departments) {
				System.out.println();
				department.print();
				
			}
		}
		System.out.println("#################################");
	}
}

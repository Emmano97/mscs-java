package mscs.java.first_week_first_day;

import java.util.ArrayList;

class Faculty extends Person {
	
	private double salary;
	
	private ArrayList<Course> courses;
	
	Faculty(){
		super();
		salary = 0;
		courses = new ArrayList<Course>();
	}
	
	Faculty(String name, String phone, int age, double salary){
		super(name, phone, age);
		this.salary = salary;
		courses = new ArrayList<Course>();
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getTotalUnits() {
		int totalUnits = 0;
		if(courses!=null && !courses.isEmpty()) {
			for(Course course: courses) {
				totalUnits += course.getUnits();
			}
			
		}
		return totalUnits;
	}
	
}

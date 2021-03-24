package mscs.java.first_week_first_day;

import java.util.ArrayList;

public class Student extends Person {
	
	private  double gpa;
	
	private ArrayList<Course> courses;
	
	Student(){
		super();
		courses = new ArrayList<Course>();
	}
	
	Student(String name, String phone, int age, double gpa){
		super(name, phone, age);
		this.gpa = gpa;
		courses = new ArrayList<Course>();
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
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

package mscs.java.first_week_first_day;

import java.util.ArrayList;

abstract class Person {
	
	private String name;
	
	private String phone;
	
	private int age;
	
	Person(){
		this.name = "";
		this.phone = "";
		this.age = 0;
	}
	
	Person(String name, String phone, int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return 0;
	}
	
	public void addCourse(Course ccourse) {
		return;
	}
	
	public int getuUTotalUnits(Course ccourse) {
		return 0;
	}
	
	public ArrayList<Course> getCourses() {
		return null;
	}

}

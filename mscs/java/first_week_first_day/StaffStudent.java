package mscs.java.first_week_first_day;

public class StaffStudent extends Staff {
	
	private Student student;
	
	StaffStudent(){
		super();
		this.student = new Student();
		
	}
	
	StaffStudent(String name, String phone, int age, double salary, double gpa){
		super(name, phone, age, salary);
		this.student = new Student(name, phone, age, gpa);
	}
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int  getTotalUnits() {
		return this.student.getTotalUnits();
	}

}

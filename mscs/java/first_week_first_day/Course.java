package mscs.java.first_week_first_day;

public class Course {
	
	private String  number;
	
	private String title;
	
	private int units;
	
	private Faculty faculty;
	
	Course(String number, String title, int units, Person faculty){
		this.number = number;
		this.title = title;
		this.units = units;
		this.faculty = (Faculty) faculty;
		((Faculty) faculty).addCourse(this);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}

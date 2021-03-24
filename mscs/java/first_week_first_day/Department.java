package mscs.java.first_week_first_day;

import java.util.ArrayList;

public class Department {
	
	private String name;
	
	private ArrayList<Person> persons;
	
	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public Department(String name) {
		this.name = name;
		persons = new ArrayList<Person>();
		
	}
	
	public Department(String name, ArrayList<Person> persons) {
		this.name = name;
		this.persons = persons;
	}
	
	public void addPerson(Person person) {
		if(persons.equals(null))
			persons = new  ArrayList<Person>();
		persons.add(person);
	}
	
	/*public double getTotalSalary() {
	 
		double result = 0;
		
		Faculty faculty;
		
		for(Person person: persons) {
			if(person instanceof Faculty) {
				
				faculty = (Faculty) person;
				
				result += faculty.getSalary();
			}
		}
		return result;
	}*/
	
	public double getTotalSalary() {
		double result = 0;
		
		for(Person person: persons) {
				result += person.getSalary();
		}
		return result;
	}
	
	public void showAllMembers() {
		
		int i = 0; 
		
		for(Person person: persons) {
			
			i++;
			
			System.out.printf("===== MEMBER %d =========\n", i);
			
			System.out.println("");
			
			System.out.printf("NAME : %s", person.getName());
			
			System.out.printf("\nPHONE NUMBER : %s", person.getPhone());
			
			System.out.printf("\nAGE : %s", person.getAge());
			
			System.out.printf("\nTYPE : %s", person.getClass().getSimpleName());
			
			System.out.println("");
			
			System.out.printf("\n======== MEMBER %d =======\n", i);
			System.out.println("");
			
		}
		
		
	}
	
	public void unitsPerFaculty() {
		Faculty faculty;
		int units = 0;
		
		if(!persons.equals(null)) {
			for(Person person: persons) {
				if(person instanceof Faculty) {
					
					faculty = (Faculty) person;
					
					if(faculty.getCourses()!=null && !faculty.getCourses().isEmpty()) {
						for(Course course: faculty.getCourses()) {
							units += 1;
							
						}
					}		

					
					System.out.printf("\n=================== FACULTY : %s =================\n", person.getName());
					
					System.out.println("");
					
					System.out.printf("UNITS : %d", units);
			
					
					System.out.println("");
					
				}
				
			}
			
		}

	}
		
	public void listOfStudentsByFaculty(String facultyName) {
		
		Faculty faculty = null;
		
		ArrayList<Person> students = new ArrayList<Person>();
		
		ArrayList<Person> facultyStudents = new ArrayList<Person>();
		
		if(!persons.equals(null)) {
			for(Person person: persons) {
				if(person instanceof Faculty && facultyName.equals(person.getName())) {
					faculty = (Faculty) person;
				}
					
				if(!students.contains(person) && (person instanceof Student || person instanceof StaffStudent)) {
					students.add(person);
				}
					
			}
			
			if(faculty != null && !students.isEmpty()) {
				for(Person student: students) {
					if(student.getCourses()!=null && !student.getCourses().isEmpty()) {
						for(Course course: student.getCourses()) {
							if(faculty.equals(course.getFaculty())) {
								facultyStudents.add(student);
							}
								
						}
					}

				}
				
				if(facultyStudents != null && !facultyStudents.isEmpty()) {
					for(Person student: facultyStudents) {
					
						System.out.printf("==============\n");
						
						System.out.println("");
						
						System.out.printf("NAME : %s", student.getName());
						
						System.out.printf("\nPHONE NUMBER : %s", student.getPhone());
						
						System.out.printf("\nAGE : %s", student.getAge());
						
						System.out.printf("\nTYPE : %s", student.getClass().getSimpleName());
						
						System.out.println("");
					
					}
				
				}else {
					System.out.println("This faculty member doesn't have student yet");
				}
			}
		
		}
	}
}

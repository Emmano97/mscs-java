package mscs.java.third_week_first_day;

import java.util.Date;
import java.util.Objects;

class  Employee implements Cloneable {
   private final String name;
   private final double salary;
   private final Date dob;
   
   
   public Employee(String name, double salary, Date dob) {
	super();
	this.name = name;
	this.salary = salary;
	this.dob = dob;
   }
   
   

   public String getName() {
	return name;
   }



	public double getSalary() {
		return salary;
	}
	
	
	
	public Date getDob() {
		return dob;
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException{
		Employee copy = (Employee) super.clone();
		return copy;
	}



	@Override
	public int hashCode() {
		return Objects.hash(dob, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		
		if (this == obj)
			return true;
		
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		
		return true;
	}
	
	public void show() {
		System.out.println(toString());
	}
   
   
   
}

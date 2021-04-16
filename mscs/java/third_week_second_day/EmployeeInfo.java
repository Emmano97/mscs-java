package mscs.java.third_week_second_day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;




public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	SortMethod method;
	
	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}
	//The Comparators are unaware of the choice of sort method
	public void sort(List<Employee>emps) {
		if (method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		}
		else if (method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}
	}
	
	
	public class EmployeeSalaryComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.getSalary() == e2.getSalary()) return 0;
			else if(e1.getSalary() < e2.getSalary()) return -1;
			else return 1;
		}
	}
	public class EmployeeNameComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	}
	
	
	public static void main(String[] args) {
		
		List<Employee>emps = new ArrayList<>();
		
		emps.add(new Employee("Joe", 100000));
		
		emps.add(new Employee("Tim", 50000));
		
		emps.add(new Employee("Andy", 60000));
		
		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		
		ei.sort(emps);
		
		System.out.println(emps);
		
		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		
		ei.sort(emps);
		
		System.out.println(emps);
		
		BiFunction<Integer, Integer, String> addiction = (x, y) -> String.valueOf(x + y);
		System.out.println(addiction.apply(5, 7));
		
		class MyBiFunctionClass implements BiFunction<Integer, Integer, String>{
			@Override
			public String apply(Integer t, Integer u) {
				return String.valueOf(t+u);
			}
			
		}
		
		MyBiFunctionClass my = new MyBiFunctionClass();
		
		System.out.println(my.apply(14, 19));
		
		String[] s = {"hello", "halla"};
		
		Consumer <String> consumer = x -> System.out.println(x);
		
		consumer.accept("My name is Emmano");
		
		Arrays.asList(s).forEach(consumer);
	}
}


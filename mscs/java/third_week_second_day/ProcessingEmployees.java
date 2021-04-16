package mscs.java.third_week_second_day;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import mscs.java.third_week_second_day.EmployeeInfo.SortMethod;

public class ProcessingEmployees
{
	
	public static Stream<Character> CharacterStream(String s){
		List<Character> result = new ArrayList<Character>();
		for(Character c: s.toCharArray())
			result.add(c);
		return result.stream();
	}
	
	static Function<Employee, String> byName = employee -> employee.getName();
	
	static Function<Employee, Double> bySalary = employee -> employee.getSalary();
	
	public static void sort(List<Employee> emps, final SortMethod method) {
		if(method == SortMethod.BYNAME)
			Collections.sort(emps, Comparator.comparing(Employee::getName));
		else
			Collections.sort(emps, Comparator.comparing(Employee::getSalary));
		
	}
	
	public static void sort(List<Employee> emps) {
			Collections.sort(emps, 
					Comparator.comparing(Employee::getName)
					.thenComparing(Employee::getSalary)
					.reversed()
					);
	}
	
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Corleone", "Bright", 4236.4, "Marketing"),
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
      	 new Employee("Bendy", "Xrown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);   //A method reference.
      
      // Predicate (boolean-valued function) that returns true for salaries 
      //in the range $4000-$6000
      Predicate<Employee> fourToSixThousand = 
         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

      // Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary
      System.out.printf(
         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

      list.stream()
          .filter(fourToSixThousand)
          .sorted(Comparator.comparing(Employee::getSalary))
          .forEach(System.out::println);

      // Display first Employee with salary in the range $4000-$6000
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
         list.stream()
             .filter(fourToSixThousand)
             .findFirst()
             .get());

      // Functions for getting first and last names from an Employee
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;

      // Comparator for comparing Employees by first name then last name
      Comparator<Employee> lastThenFirst = 
         Comparator.comparing(byLastName).thenComparing(byFirstName);

      // sort employees by last name, then first name 
      System.out.printf(
         "%nEmployees in ascending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst)
          .forEach(System.out::println);

      // sort employees in descending order by last name, then first name
      System.out.printf(
         "%nEmployees in descending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst.reversed())
          .forEach(System.out::println);

      // display unique employee last names sorted
      System.out.printf("%nUnique employee last names:%n");
      list.stream()
          .map(Employee::getLastName)
          .distinct()
          .sorted()
          .forEach(System.out::println);

      // display only first and last names
      System.out.printf(
         "%nEmployee names in order by last name then first name:%n"); 
      list.stream()
          .sorted(lastThenFirst)
          .map(Employee::getName)
          .forEach(System.out::println);

      // group Employees by department
      System.out.printf("%nEmployees by department:%n"); 
      Map<String, List<Employee>> groupedByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment));

      /*groupedByDepartment.forEach(
         (department, employeesInDepartment) -> 
         {
            System.out.println(department);
            employeesInDepartment.forEach(
               employee -> System.out.printf("   %s%n", employee));
         }
      );*/
      

      // count number of Employees in each department
      System.out.printf("%nCount of Employees by department:%n"); 

      Map<String, Long> employeeCountByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment, 
                TreeMap::new, Collectors.counting()));

      employeeCountByDepartment.forEach(
         (department, count) -> System.out.printf(
            "%s has %d employee(s)%n", department, count));

/*  Output looks something like :

        HR  4
        IT  8
        Sales  12
*/


      // sum of Employee salaries with DoubleStream sum method
      System.out.printf(
         "%nSum of Employees' salaries (via sum method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .sum());

      // calculate sum of Employee salaries with Stream reduce method
      System.out.printf(
         "Sum of Employees' salaries (via reduce method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .reduce(0, (value1, value2) -> value1 + value2));  

      // average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .average()
             .getAsDouble());
      
      /***************************8 Homeworks *********************/
      
      System.out.printf("%nNumber of names that begin with 'B' : %s%n",
    		  list.stream()
    		  .filter(employee -> employee.getName().startsWith("B"))
    		  .count());
      
      
      System.out.printf("%nEmployee of firstname that begin with 'B' : %n%n");
    		  list.stream()
    		  .filter(employee -> employee.getFirstName().startsWith("B"))
    		  .sorted()
    		  .forEach(employee -> System.out.println(employee));
      
      
      System.out.printf("%nStart with 'B' all capitalized : %n");
    		  list.stream()
    		  .map(employee -> {
    			  if(employee.getLastName().startsWith("B")) {
    				  employee.setFirstName(employee.getFirstName().toUpperCase());
			          employee.setLastName(employee.getLastName().toUpperCase());
    			  }
    			  return employee;
    		  })
    		  .forEach(employee -> System.out.println(employee));
    		  
      System.out.printf("%n Start with 'B' last name capitalized : %n");
    		  list.stream()
    		  .map(employee -> {
    			  if(employee.getLastName().startsWith("B")) {    				 
			          employee.setLastName(employee.getLastName().toUpperCase());
    			  }
    			  return employee;
    		  })
    		  .forEach(employee -> System.out.println(employee));
    		  
    System.out.printf("%n All employees with joining : %n%s%n",
    		  list.stream()
    		  .map(employee -> employee.toString())
    		  .collect(Collectors.joining(" | ")));
    
    System.out.printf("%n All employees with joining : %n%s%n",
  		  String.join("---\n---", 
    		list.stream()
    		.map(Object::toString)
    		.collect(Collectors.toList())));
    
    
    System.out.printf("%n All employees objects last names, whose last name begin with 'I' : %n");
	  list.stream()
	  .filter(employee -> employee.getLastName().startsWith("I"))
	  .forEach(employee -> System.out.println(employee.getLastName()));
	  
      System.out.printf("%nAverage  of all salaries : %.2f%n",
    		  list.stream()
    		  .collect(Collectors.averagingDouble(Employee::getSalary)));
      
      
      list.stream()
    		  .collect(Collectors.groupingBy(Employee::getDepartment))
    		  .forEach((dept, emps) -> {
    			  System.out.println(dept);
    			  System.out.println(emps);
    		  });
      
      System.out.printf("%nTotal  of all salaries : %.2f%n",
    		  list.stream()
    		  .map(employee -> employee.getSalary())
    		  .reduce(0.0, (x, y) -> x+y ));
      
      System.out.printf("%nAll employees objects last names : %n");
	  	  list.stream()
	  	  .map(employee -> employee)
	  	  .forEach(employee -> System.out.println(employee.getLastName()));
	  	  
	 System.out.printf("%n Infite stream's 20 elements : %n");
		  list.stream()
		  .filter(employee -> employee.getLastName().startsWith("I"))
		  .forEach(employee -> System.out.println(employee.getLastName()));
		  
		  
	  Stream<String> echos = Stream.generate(() -> "echo");
	  
	  Stream<Double> randoms =  Stream.generate(Math::random);
	  
	  /*Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.TWO))
			  .limit(20)
			  .forEach(n -> System.out.println(n));
		
	  IntStream.iterate(0, n -> n+2)
	  .limit(20)
	  .forEach(n -> System.out.println(n));*/
	  
	  Stream.iterate(0, n -> n + 2)
	  .limit(5)
	  .skip(1)
	  .forEach(n -> System.out.println(n));
	  
	  Stream.concat(CharacterStream("HEllo "), CharacterStream("World!"));
	  
	  System.out.println(Arrays.toString(employees));
	  
	  sort(Arrays.asList(employees));
	  
	  System.out.println(Arrays.toString(employees));
	  
	  Arrays.stream(employees).forEach(e  -> e.show());
	  
	  String s = Stream.of("A", "good", "day", "to", "write", "some", "Java")
			  .reduce("", (x, y)-> x+" "+y);
	  
	  System.out.println(s);
			  
	  
	  
    		  
    		  
    		/* List<Integer> ints = Arrays.asList(1,3,9,4,6);
    		 
    		 List<int[]> intArrays = ints.stream()
    				 .map(int[]::new)
    				 .collect(Collectors.toList());
    		 
    		 intArrays.stream()
    		 	.map(arr -> Arrays.toString(arr))
    		 	.forEach(string  -> System.out.println(string));*/
    		  
    		  
      
      
   } // end main
} // end class ProcessingEmployees

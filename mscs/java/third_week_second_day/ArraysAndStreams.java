package mscs.java.third_week_second_day;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams  {
	
	public static void main(String[] args) {
		
		Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
		
		System.out.printf("Sorted values: %s%n", Arrays.asList(values));
		
		System.out.printf("Sorted values: %s%n", 
				Arrays.stream(values)
					.sorted().collect(Collectors.toList()));
		
		List<Integer> greaterThanFour = Arrays.stream(values)
				.filter(value -> value > 4)
				.collect(Collectors.toList());
		
		System.out.printf("Sorted values greather than 4 : %s%n", 
				Arrays.stream(values)
				.filter(value -> value > 4 )
				.sorted()
				.collect(Collectors.toList()));
		
	      System.out.printf(
	    	         "Values greater than 4 (ascending with streams): %s%n",
	    	         greaterThanFour.stream()
	    	               .sorted()
	    	               .collect(Collectors.toList()));

	}
	
	
} 


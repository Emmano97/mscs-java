package mscs.java.third_week_second_day;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public final class PracticeStreams {


	
	public static void  pickName(List<String> names, String startingLetter) {
		
		Optional<String>  retrivedName = names.stream()
				.filter(name  -> name.startsWith(startingLetter))
				.findFirst();
		
		Optional<String>  retrivedNames = names.stream()
				.filter(name  -> name.startsWith(startingLetter))
				.findAny();
		
		
		System.out.printf("%n %s %n", retrivedName.orElse("Nothing found"));
		
		retrivedNames.ifPresent(name -> System.out.println(name));
			
		
	}
	
	public static void main(String[] args) {
		
		String[] names = {"gulles", "baradra", "Arnaldo", "Girdana", "julien"};
		
		List<String> list  = Arrays.asList(names);
		
		PracticeStreams.pickName(list, "J");

	}
	
	

}

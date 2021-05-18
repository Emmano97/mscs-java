package bigdata.week1.day1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Application {
	
	public static String readFile(String fileName) {
		
		Path filePath = Path.of(fileName);
		
		String content = null;
		
		try {
			content = Files.readString(filePath);
		} catch (IOException e) {
			System.out.println("The file you are trying to read doesn't exist");
			e.printStackTrace();
		}
		
		return content;
		
	}

	public static List<String> extractWords(String text) {
		
		List<String> result = new ArrayList<String>();
		
		int i;
		
		StringBuilder currentWord = new StringBuilder();
		
		char c;
		
		for(i=0; i<text.length(); i++) {		
			c = text.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				currentWord.append(c);
			}else {
				if(!currentWord.toString().isBlank())
					result.add(currentWord.toString());
				currentWord = new StringBuilder();
			}
		}
		
		if(!currentWord.toString().isBlank())
			result.add(currentWord.toString());
		
		return result;
	}
	
	public static List<String> getExtractedWords(String content){

		List<String> extractedWordList = new ArrayList<String>();

		if(content != null && !content.isBlank()){
			List<String> contentList = Arrays.asList(content.split(" "));
			Iterator<String> iterator = contentList.iterator();
			while(iterator.hasNext()) {
				List<String> words = extractWords(iterator.next());
				
				if(words!=null && !words.isEmpty()) {
					words.forEach(word -> extractedWordList.add(word));
				}
				
			}
		}
		
		return extractedWordList;
	}
		
	public static Mapper mapContent(List<String> words) {
		
		Mapper mapper = new  Mapper();
		Pair<String, Integer> pair;
		
		if(words!=null && !words.isEmpty()) {
			
			Iterator<String> iterator = words.iterator();
			
			while(iterator.hasNext()) {
				pair = new Pair<String, Integer>(iterator.next(), 1);
				mapper.addPair(pair);
			}
			
		}
		
		return mapper;
	}

	public static void main(String[] args) {
		File file = new File("testDataForW1D1.txt");
		String content = Application.readFile(file.getAbsolutePath());
		
		List<String> extractedWords  = Application.getExtractedWords(content);
		
		Mapper mapper = Application.mapContent(extractedWords);
		
		mapper.displayPairs();
		
	}

}

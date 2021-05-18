package bigdata.week1.day1;

import java.util.ArrayList;
import java.util.List;

public class Mapper {
	
	private List<Pair> pairs;
	
	public  Mapper() {
		pairs = new ArrayList<Pair>();
	}

	public List<Pair> getPairs() {
		return pairs;
	}

	public void setPairs(List<Pair> pairs) {
		this.pairs = pairs;
	}
	
	public void addPair(Pair pair) {
		pairs.add(pair);
	}

	public void displayPairs() {
		if(pairs!=null && !pairs.isEmpty()) {
			pairs.forEach(Pair::displayPair);
		}
	}
	
	

}

package mscs.java.third_week_fourth_day;

import java.util.List;

public class SimplePair<K, V> {
	private K  key;
	private V  value;
	
	public SimplePair(K key, V  value) {
		this.key =  key;
		this.value  =  value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V  getValue() {
		return value;
	}
	
	public static <K, V>  boolean compare(SimplePair<K, V>  first, SimplePair<K, V>  second) {
		return first.getKey().equals(second.getKey()) &&
				first.getValue().equals(second.getValue());
				
	}
	
	public static <T extends Comparable> T max(List<T> list) {
		T max = list.get(0);
		for(T el : list) {
			if(el.compareTo(max) > 0)
				max = el;
		}
		return max;
	}
	
	
	
	public void main(String[] args) {
		SimplePair<Integer, String> p1 = new SimplePair<>(1, "apple");
		SimplePair<Integer, String> p2 =  new SimplePair<>(2, "pear");
		
		//boolean areTheySame = Util.<Integer, String>compare(p1, p2);
	}
}

package bigdata.week1.day1;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair() {
		this.key = null;
		this.value = null;
	}
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	public void displayPair() {
		String result =  "Pair <" + key + ", " + value + ">\n";
		System.out.println(result);
	}

	@Override
	public String toString() {
		return "Pair <key=" + key + ", value=" + value + ">\n";
	}

}

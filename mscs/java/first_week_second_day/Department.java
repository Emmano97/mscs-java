package mscs.java.first_week_second_day;

import java.util.ArrayList;

public class Department {
	private String name;
	private String location;
	private Company company;
	ArrayList<Position> positions;
	
	Department(){
		name = "";
		location = "";
		company = new Company();
		positions = new ArrayList<Position>();
	}
	
	Department(String name, String location){
		this.name = name;
		this.location = location;
		company = new Company();
		positions = new ArrayList<Position>();
	}
	
	Department(String name, String location, Company company){
		this.name = name;
		this.location = location;
		this.company = company;
		positions = new ArrayList<Position>();
	}
	
	public void addPosition(Position position) {
		this.positions.add(position);
	}
	
	public void print() {
		
	}

}

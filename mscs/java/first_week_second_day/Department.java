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
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public ArrayList<Position> getPositions() {
		return positions;
	}

	public void setPositions(ArrayList<Position> positions) {
		this.positions = positions;
	}

	public void addPosition(Position position) {
		this.positions.add(position);
	}
	
	public void print() {
		
		System.out.println("=========== Department ===========");
		System.out.printf("\nName: %s \n \n Location: %s \n", name, location);
		
		
		if(positions!=null && !positions.isEmpty()) {			
			for(Position position: positions) {
				System.out.println();
				position.print();
				
			}
		}
		System.out.println("================================");
		
	}

}

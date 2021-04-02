package mscs.java.midterm_review;

public abstract class Attendee implements IAttendee {
	private String name;
	private String  address;
	
	
	public Attendee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public abstract double getRegistrationFee();
	
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

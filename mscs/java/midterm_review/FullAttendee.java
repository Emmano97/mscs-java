package mscs.java.midterm_review;

public class FullAttendee extends Attendee {
	
	private double registrationFee;
	
	public FullAttendee(String name, String address, double registrationFee) {
		super(name, address);
		this.registrationFee = registrationFee;

	}

	@Override
	public double getRegistrationFee() {
		return registrationFee;
	}

}

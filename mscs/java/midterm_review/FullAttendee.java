package mscs.java.midterm_review;

public class FullAttendee extends Attendee {
	
	public FullAttendee(String name, String address) {
		super(name, address);

	}

	@Override
	public double getRegistrationFee() {
		return 0;
	}

}

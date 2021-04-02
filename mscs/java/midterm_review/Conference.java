package mscs.java.midterm_review;

import java.util.ArrayList;

public class Conference {
	
	private String name;
	
	private double fullConferenceFee;
	
	private ArrayList<IAttendee> attendees;
	
	
	
	public Conference(String name, double fullConferenceFee) {
		super();
		this.name = name;
		this.fullConferenceFee = fullConferenceFee;
		attendees = new ArrayList<IAttendee>();
	}

	public String getName() {
		return name;
	}
	
	public void addAttendee(Attendee attendee) {
		attendees.add(attendee);
	}
	
	public double getFullFee() {
		return fullConferenceFee;
	}
	
	public double getTotalPayments() {
		
		double totalPayment = 0;
		
		if(attendees!=null && !attendees.isEmpty()) {
			for(IAttendee attendee: attendees) {
				totalPayment += attendee.getRegistrationFee();
			}
		}
		
		return totalPayment;
	}
	
	

}

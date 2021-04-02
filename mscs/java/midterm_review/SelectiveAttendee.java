package mscs.java.midterm_review;

import java.util.ArrayList;

public class SelectiveAttendee extends Attendee {
	
	private ArrayList<Session> sessions;
	
	public SelectiveAttendee(String name, String address) {
		super(name, address);
		this.sessions = new ArrayList<Session>();
	}
	
	public void addSession(Session session) {
		this.sessions.add(session);
	}


	@Override
	public double getRegistrationFee() {
		double totalFee = 0;
		if(sessions!=null && !sessions.isEmpty()) {
			for(Session session: sessions) {
				totalFee += session.getSessionFee();
			}
		}
		
		return totalFee;
	}
	
	public double smallestFee() {
		double smallestFee = getRegistrationFee();
		if(sessions!=null && !sessions.isEmpty()) {
			for(Session session: sessions) {
				smallestFee  = session.getSessionFee() < smallestFee ?
						session.getSessionFee():smallestFee;
			}
		}
		
		return smallestFee;
	}

}

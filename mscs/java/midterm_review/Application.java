package mscs.java.midterm_review;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		Conference googleIO = new Conference("Google IO 2021", 6000);
		
		Session googleFinance = new Session("google finance", 1500);
		
		Workshop androidArchitecture = new Workshop("Android Architecture", 2000);
		
		SelectiveAttendee wiyang = new SelectiveAttendee("wi yang", "Tokyo Japan");
		
		FullAttendee kpapkoEdwige = new FullAttendee("Edwige Kpakpo", "Lome Togo");
		
		googleIO.addAttendee(kpapkoEdwige);
		
		googleIO.addAttendee(wiyang);
		
		wiyang.addSession(googleFinance);
		
		wiyang.addSession(androidArchitecture);
		
		System.out.println(googleIO.getTotalPayments());
		
	}

}

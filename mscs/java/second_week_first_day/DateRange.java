package mscs.java.second_week_first_day;

import java.time.LocalDateTime;

public class DateRange extends Employee {
	
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	DateRange(LocalDateTime startDate){
		this.startDate = startDate;
	}
	
	
	DateRange(LocalDateTime startDate, LocalDateTime endDate){
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public boolean isInRange(LocalDateTime date) {
		if(date.compareTo(startDate) > 0 && date.compareTo(endDate) < 0 )
			return true;
		return false;
	}
	
	public String toString() {
		return "";
	}
	
	public static int getFirstDayOfMonth() {
		
		return 0;
	}
	
	public static int getLastDayOfMonth() {
		return 0;
	}
	

	@Override
	double calcGrossPay(DateRange dateRange) {
		return 0;
				
	}

}

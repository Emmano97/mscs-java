package mscs.java.midterm_review;

public class Session {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double fee;
	
	
	Session(){
		this.name = "";
		this.fee = 0;
	}
	
	public Session(String name, double fee) {
		this.name = name;
		this.fee = fee;
	}

	public double getSessionFee() {
		return fee;
	}

}

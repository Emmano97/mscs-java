package mscs.java.second_week_first_day;

public enum Tax {
	
	FICA(23),
	STATE_TAX(5),
	LOCAL_TAX(1),
	MEDICARE(3),
	SOCIAL_SECURITY(7.5);
	

    private final double value;

    Tax(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

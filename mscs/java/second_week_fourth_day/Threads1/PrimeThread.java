package mscs.java.second_week_fourth_day.Threads1;

public class PrimeThread extends Thread {
    int beginNumber;
    int endNumber;
    
    PrimeThread(int beginNumber, int endNumber) {
        this.beginNumber = beginNumber;
        this.endNumber = endNumber;
    }
    
    boolean isPrime(int  number) {
    	for(int  i=2; i<number; i++) {
    		if(number % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }

    public void run() {
    	for(int i=beginNumber; i<=endNumber; i++) {
    		if(isPrime(i)) {
    			System.out.println(i); 
    		}
    	}
    }
}

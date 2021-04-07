package mscs.java.second_week_fourth_day.Threads2;

public class PrimeThread extends Thread {
    long threadNumber;
    PrimeThread(long threadnbr) {
    	 threadNumber = threadnbr;
    }

    public void run() {
 // compute primes larger than minPrime
    	
        System.out.println("Inside 'run' of thread  " + threadNumber);      
    	
         //  . . .
    }
}

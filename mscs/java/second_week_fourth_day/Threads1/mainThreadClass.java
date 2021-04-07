package mscs.java.second_week_fourth_day.Threads1;

public class mainThreadClass {

    public static void main( String[] args ) {


        /**
         * Question 4
         */

        PrimeThread q1 = new PrimeThread(1, 200000);
        q1.start();
        
        PrimeThread q2 = new PrimeThread(200000, 400000);
        q2.start();
        
        PrimeThread q3 = new PrimeThread(400000, 600000);
        q3.start();
        
        PrimeThread q4 = new PrimeThread(600000, 800000);
        q4.start();
        
        PrimeThread q5 = new PrimeThread(800000, 1000000);
        q5.start();
        
        
        /**
         * Question 5
         */
        
        PrimeThread p1 = new PrimeThread(1, 100000);
        p1.start();
        
        PrimeThread p2 = new PrimeThread(100000, 200000);
        p2.start();
        
        PrimeThread p3 = new PrimeThread(200000, 300000);
        p3.start();
        
        PrimeThread p4 = new PrimeThread(300000, 400000);
        p4.start();
        
        PrimeThread p5 = new PrimeThread(400000, 500000);
        p5.start();
        
        PrimeThread p6 = new PrimeThread(500000, 600000);
        p6.start();
        
        PrimeThread p7 = new PrimeThread(600000, 700000);
        p7.start();
        
        PrimeThread p8 = new PrimeThread(700000, 800000);
        p8.start();
        
        PrimeThread p9 = new PrimeThread(800000, 900000);
        p9.start();
        
        PrimeThread p10 = new PrimeThread(900000, 1000000);
        p10.start();
       
    }
}

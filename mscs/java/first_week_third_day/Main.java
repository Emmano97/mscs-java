package mscs.java.first_week_third_day;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Zone zone = Zone.OTHERS;
		
		String result="";
		
		System.out.print("Enter the number of packages to send: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int numberOfPackage = scanner.nextInt();
		
		for (int i = 0; i < numberOfPackage; i++) {
			
			System.out.print("\nEnter the name of te package: ");
			
			String packageName = scanner.next();
			
			System.out.print("\nEnter the weight of the package: ");
			
			int packageWeight = scanner.nextInt();
			
			System.out.print("\nEnter the zone delivery zone: ");
			
			String packageZone = scanner.next();
			
			Ups upsCarrier = new Ups(packageWeight, packageName);
			
			UsMail usMailCarrier= new UsMail(packageWeight, packageName);
			
			switch(packageZone.toUpperCase()) {
			
				case "IA":
					zone = zone.IA;
					break;
					
				case "MT":
					zone = zone.MT;
					break;
					
				case "OR":
					zone = zone.OR;
					break;
					
				case "CA":
					zone = zone.CA;
					break;
					
				case "TX":
					zone = zone.TX;
					break;
					
				case "UT":
					zone = zone.UT;
					break;
					
				case "FL":
					zone = zone.FL;
					break;
					
				case "MA":
					zone = zone.MA;
					break;
					
				case "OH":
					zone = zone.OH;
					break;
					
				default:
					zone = Zone.OTHERS;
					break;
			}
			Fedex fedexCarrier = new Fedex(zone, packageWeight, packageName);
			
			List<ShippingCarrier> carriers = new ArrayList<ShippingCarrier>();	
			
			carriers.add(upsCarrier);
			carriers.add(usMailCarrier);
			carriers.add(fedexCarrier);
			
			double currentLowRate = carriers.get(0).getRate();
			
			String currentLowCarrier = carriers.get(0).getClass().getSimpleName();
			
			for(ShippingCarrier carrier : carriers) {
				if(carrier.getRate() < currentLowRate) {
					currentLowRate = carrier.getRate();
					currentLowCarrier = carrier.getClass().getSimpleName();
				}
			}
			result += packageName+ "  "+"$"+currentLowRate+" "+currentLowCarrier+"\n";
		}
		
		System.out.println(result);
	}
	
}

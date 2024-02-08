import java.io.*;
import java.util.Scanner;
public class FlightService {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your FIRST AND LAST NAME:");
		String name = sc.nextLine();
		System.out.println("Name: " + name);
		
		
		FlightBookingFactory flightFactory = new FlightBookingFactory();
		System.out.println("Please enter what SEAT CLASS NAME you wanted to purchase:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		
		
		String flightName = br.readLine();
		System.out.println("Please enter how many SEATS you wanted to purchase:");
		int seats = Integer.parseInt(br.readLine());
				
		FlightBooking fb = flightFactory.getFlightBooking(flightName);
		
		System.out.println("Your purchase for " + flightName + " of " + seats + " ticket is: ");
		fb.getPriceRates();
		fb.calculatePrice(seats);
		  
		
	}

}

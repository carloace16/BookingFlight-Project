
public class FlightBookingFactory {
	
	public FlightBooking getFlightBooking (String flight) {
		if (flight == null || flight.isEmpty()) {	
			return null;
		}
		if( flight.equalsIgnoreCase("ECONOMY")) {
			return new EconomyClass();
		}
		else if (flight.equalsIgnoreCase("BUSINESS")) {
			return new BusinessClass();
		}
		else if (flight.equalsIgnoreCase("FIRST")) {
			return new FirstClass();
		}
		return null;
	}

}

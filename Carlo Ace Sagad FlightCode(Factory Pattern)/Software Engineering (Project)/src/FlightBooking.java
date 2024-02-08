public abstract class FlightBooking {
	
	protected double priceRates;
	public abstract void getPriceRates();
	
	public void calculatePrice(int ticket) {
		System.out.println(ticket * priceRates);
	}
	
}

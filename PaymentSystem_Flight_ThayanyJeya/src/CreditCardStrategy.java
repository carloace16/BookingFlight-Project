import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Pay by CreditCard strategy
 */
public class CreditCardStrategy implements PaymentStrategy {
	
	/**
	 * buffer reader
	 */
	private BufferedReader reader;
	
	/**
	 * output
	 */
	private PrintWriter out;
	
	/**
	 * constructor
	 * 
	 * @param reader reader
	 * @param out output
	 */
	public CreditCardStrategy(BufferedReader reader, PrintWriter out) {
		this.reader = reader;
		this.out = out;
	}
	
	/**
	 * credit card number
	 */
	private String number;
    
	/**
	 * date
	 */
	private String date;
	
	/**
	 * cvv
	 */
    private String cvv;
	

	@Override
	public void pay(Order order) {
		
		if (number != null && !number.equals("") && 
				date != null && !date.equals("") && 
				cvv != null && !cvv.equals("")) {
			out.print("Payment Successful");
			
			order.setTotalCost(0);
			
		}else {
			out.print("Invalid credit card! Payment Failed");
		}
	}

	@Override
	public void provideDetails() {
		
		try {
			number = reader.readLine();
			date = reader.readLine();
			cvv = reader.readLine();
		} catch (IOException e) {
			number = "";
			date = "";
			cvv = "";
		}
	}

}

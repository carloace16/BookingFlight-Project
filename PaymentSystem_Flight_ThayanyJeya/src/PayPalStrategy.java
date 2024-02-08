import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Pay by PayPal strategy
 */
public class PayPalStrategy implements PaymentStrategy {
	
	/**
	 * buffer reader
	 */
	private BufferedReader reader;
	
	/**
	 * output
	 */
	private PrintWriter out;
	
	/**
	 * email
	 */
	private String email = "";
	
	/**
	 * password
	 */
	private String password = "";
	
	/**
	 * constructor
	 * 
	 * @param reader reader
	 * @param out output
	 */
	public PayPalStrategy(BufferedReader reader, PrintWriter out) {
		this.reader = reader;
		this.out = out;
	}
	

	@Override
	public void pay(Order order) {
		
		if (email != null && !email.equals("") && password != null &&
				!password.equals("")) {
			out.print("Payment Successful");
			
			order.setTotalCost(0);
		}else {
			out.print("Wrong email or password! Payment Failed");
		}
	}

	@Override
	public void provideDetails() {
		
		try {
			email = reader.readLine();
			password = reader.readLine();
		} catch (IOException e) {
			email = "";
			password = "";
		}
	}

}

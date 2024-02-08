import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * Pay by cash strategy
 */
public class CashStrategy implements PaymentStrategy {
	
	/**
	 * buffer reader
	 */
	private BufferedReader reader;
	
	/**
	 * output
	 */
	private PrintWriter out;
	
	/**
	 * input amount
	 */
	private int amountInput;
	
	/**
	 * constructor
	 * 
	 * @param reader reader
	 * @param out output
	 */
	public CashStrategy(BufferedReader reader, PrintWriter out) {
		this.reader = reader;
		this.out = out;
	}

	@Override
	public void pay(Order order) {
		
		if (amountInput >= order.getTotalCost()) {
			
			out.print("Payment Successful");
			
			//pay all cost
			order.setTotalCost(0);
			
		}else {
			
			//pay some cost
			order.setTotalCost(order.getTotalCost() - amountInput);
			
			out.print("Pay only $" + amountInput);
		}
	}

	@Override
	public void provideDetails() {
		
		try {
			amountInput = Integer.parseInt(reader.readLine());
		}catch(Exception e) {
			amountInput = 0;
		}
	}

}

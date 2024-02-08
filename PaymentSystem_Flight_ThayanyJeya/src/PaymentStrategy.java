/**
 * PaymentStrategy class represents the payment strategy
 * that defines the prototypes that the specific payment
 * should follow 
 *
 */
public interface PaymentStrategy {
	
	/**
	 * pay the amount
	 * @param order order to pay
	 */
	 public void pay(Order order);
	 
	 /**
	  * provide the details for the payment processing
	  */
	 public void provideDetails();
}

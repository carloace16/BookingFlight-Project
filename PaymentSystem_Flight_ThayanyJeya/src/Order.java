/**
 * Order class represents an order
 */
public class Order {

	/**
	 * total cost
	 */
	private int totalCost;

	/**
	 * constructor
	 * @param totalCost
	 */
	public Order(int totalCost) {
		this.totalCost = totalCost;
	}
	
	/**
	 * get total cost
	 * @return total cost
	 */
	public int getTotalCost() {
		return totalCost;
	}
	
	/**
	 * set total cost
	 * @param totalCost total cost
	 */
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * pay this order
	 * @param strategy specific strategy
	 */
	public void processOrder(PaymentStrategy strategy) {
        strategy.provideDetails();
        strategy.pay(this);
    }
}

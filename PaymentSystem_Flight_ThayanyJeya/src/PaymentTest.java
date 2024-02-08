import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

/**
 * Payment Test
 */
public class PaymentTest {

	@Test
	/**
	 * test pay by cash, enough cash to pay
	 */
	void testEnoughCash() {
		
		//create the input
		Reader inputString = new StringReader("10");
		BufferedReader reader = new BufferedReader(inputString);
		
		//create the output
		StringWriter out    = new StringWriter();
	    PrintWriter  writer = new PrintWriter(out);
		
		PaymentStrategy strategy = new CashStrategy(reader, writer);
		
		//provide the details
		strategy.provideDetails();
		
		Order order = new Order(10);
		
		//pay
		strategy.pay(order);
		assertEquals(0, order.getTotalCost());
		
		assertEquals("Payment Successful", out.toString());
	}
	
	@Test
	/**
	 * Test pay by cash, not enough cash
	 */
	void testNotEnoughCash() {
		
		//create the input
		Reader inputString = new StringReader("10");
		BufferedReader reader = new BufferedReader(inputString);
		
		//create the output
		StringWriter out    = new StringWriter();
	    PrintWriter  writer = new PrintWriter(out);
		
		PaymentStrategy strategy = new CashStrategy(reader, writer);
		
		//provide the details
		strategy.provideDetails();
		
		Order order = new Order(20);
		
		//pay
		strategy.pay(order);
		assertEquals(10, order.getTotalCost());
		
		assertEquals("Pay only $10", out.toString());
	}
	
	//Component Testing
	@Test
	/**
	 * Test pay by cash, not enough cash
	 */
	void testPayManyTimes() {
		
		//create the input
		Reader inputString = new StringReader("10");
		BufferedReader reader = new BufferedReader(inputString);
		
		//create the output
		StringWriter out    = new StringWriter();
	    PrintWriter  writer = new PrintWriter(out);
		
		PaymentStrategy strategy = new CashStrategy(reader, writer);
		
		//provide the details
		strategy.provideDetails();
		
		Order order = new Order(20);
		
		//pay
		strategy.pay(order);
		assertEquals(10, order.getTotalCost());
		
		assertEquals("Pay only $10", out.toString());
		
		
		//pay again by credit card
		inputString = new StringReader("1234567890\n11/02/2024\n4356\n");
		reader = new BufferedReader(inputString);
		
		//create the output
		out    = new StringWriter();
	    writer = new PrintWriter(out);
	    
	    strategy = new CreditCardStrategy(reader, writer);
		
		//provide the details
		strategy.provideDetails();
	    
		strategy.pay(order);
		assertEquals(0, order.getTotalCost());
		
		assertEquals("Payment Successful", out.toString());
		
		System.out.println("The order ($20) was paid $10 by cash and");
		System.out.println("$10 by credit card (number: 1234567890, date: 11/02/2024, cvv: 4356)");
		
	}
	
}

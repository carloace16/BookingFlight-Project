import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

/**
 * Airline Booking
 * 
 * Payment System
 *
 */
public class Driver {

	/**
	 * main method to start Java application
	 * @param args program arguments
	 */
	public static void main(String[] args) {
		
		//order
		Order order = new Order(100);
		
		System.out.println("Total price is $" + order.getTotalCost());
		
		// display menu and read selection
        int selection = menu();
        
        // run until user quits
        while (selection != 0 && order.getTotalCost() > 0) {
        	
            // process user command
            switch (selection) {

                case 1: // Pay by cash
                	payByCash(order);
                    break;
                case 2:// Pay by credit card
                	payByCreditCard(order);
                	break;                    
                case 3:// Pay by Paypal
                	payByPaypal(order);
                    break;

                default:
                    System.out.println("Invalid selection");
                    break;
            }

            if (order.getTotalCost() > 0) {
            	
	            System.out.println();
	            
	            System.out.println("Total price is $" + order.getTotalCost());
	
	            // display menu and read selection
	            selection = menu();
            }
        }

        System.out.println("\nThank you for using the payment system");
	}
	
	/**
	 * pay by paypal
	 * @param order order
	 * @return true/false
	 */
	private static void payByPaypal(Order order) {
		
		System.out.print("Enter the email: ");
		String email = keyboard.nextLine();
		
		System.out.print("Enter the password: ");
		String password = keyboard.nextLine();
		
		String input = email + "\n" + password + "\n";
		
		//create the input
		Reader inputString = new StringReader(input);
		BufferedReader reader = new BufferedReader(inputString);
		
		//create the output
		StringWriter out    = new StringWriter();
	    PrintWriter  writer = new PrintWriter(out);
		
		PaymentStrategy strategy = new PayPalStrategy(reader, writer);
		
		//provide the details
		strategy.provideDetails();
		
		//pay
		strategy.pay(order);
		
		System.out.println(out.toString());
		
	}
	
	/**
	 * pay by credit card
	 * @param order order
	 * @return true/false
	 */
	private static void payByCreditCard(Order order) {
		
		System.out.print("Enter the card number: ");
		String number = keyboard.nextLine();
		
		System.out.print("Enter the expiration date: ");
		String date = keyboard.nextLine();
		
		System.out.print("Enter the cvv number: ");
		String cvv = keyboard.nextLine();
		
		String input = number + "\n" + date + "\n" + cvv + "\n";
		
		//create the input
		Reader inputString = new StringReader(input);
		BufferedReader reader = new BufferedReader(inputString);
		
		//create the output
		StringWriter out    = new StringWriter();
	    PrintWriter  writer = new PrintWriter(out);
		
		PaymentStrategy strategy = new CreditCardStrategy(reader, writer);
		
		//provide the details
		strategy.provideDetails();
		
		//pay
		strategy.pay(order);
		
		System.out.println(out.toString());
		
	}
	
	/**
	 * pay by cash
	 * @param order order
	 * @return true/false
	 */
	private static void payByCash(Order order) {
		
		System.out.print("Enter the amount of cash: ");
		int cash = readInt();
		
		//create the input
		Reader inputString = new StringReader(String.valueOf(cash));
		BufferedReader reader = new BufferedReader(inputString);
		
		//create the output
		StringWriter out    = new StringWriter();
	    PrintWriter  writer = new PrintWriter(out);
		
		PaymentStrategy strategy = new CashStrategy(reader, writer);
		
		//provide the details
		strategy.provideDetails();
		
		//pay
		strategy.pay(order);
		
		System.out.println(out.toString());
		
	}

	/**
     * display menu and return selection
     *
     * @return selection
     */
    private static int menu() {

        System.out.println("1. Pay by cash");
        System.out.println("2. Pay by credit card");
        System.out.println("3. Pay by Paypal");
        System.out.println("0. Quit");

        return readInt();
    }
	
	/**
    * create the Scanner to read from standard input
    */
   private static Scanner keyboard = new Scanner(System.in);
	
	/**
     * read an integer from console
     *
     * @return integer an integer
     */
    public static int readInt() {

        int integerNumber;

        // loop until user enters an integer
        while (true) {

            try {

                integerNumber = Integer.parseInt(keyboard.nextLine());
                break; // valid integer number

            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Try again: ");
            } // end try
        } // end while

        return integerNumber;
    }
}

import java.util.HashMap;
import java.util.LinkedHashMap;
//part of the step (2) Booking.

public class TicketPrice {
    //I use map to store the price of the ticket.
    public static HashMap<String, Integer> Price = new LinkedHashMap<String, Integer>();

    public void setPrice() {
        this.Price.put("FirstClass",1000);
        this.Price.put("BusinessClass",500);
        this.Price.put("EconomyClass",200);
    }

    public void displayPrice(){
        System.out.println(this.Price.entrySet());
    }
}

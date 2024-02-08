//part of the step (1) searching a flight
public class FlightSearch {

    public void FlightDisplay() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Welcome to Queens college Flight Booking System.");
        System.out.println("We currently have " + (InitialSettings.myList.size()) + " Flight(s) to Queens College.");
        for(int i=0;i<InitialSettings.myList.size();i++){
            System.out.println("Flight# "+(i+1)+" has seat available of "+InitialSettings.myList.get(i));
        }
        System.out.println("----------------------------------------------------------------------------");
    }

    public void PriceDisplay() {
        TicketPrice ticketPrice= new TicketPrice();
        ticketPrice.setPrice();
        ;
        System.out.println("Displaying the corresponding Price($):  ");
        ticketPrice.displayPrice();
        System.out.println("----------------------------------------------------------------------------");
    }

}


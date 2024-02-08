/*
The online booking process involves numerous interactions between various systems and multiple steps：
(1) Searching a flight           -in progress
(2) Booking                      -in progress
(3) Creating a PNR               -not started
(4) Payment processing           -not started
(5) Ticketing                    -not started
(6) Departure                    -not strated(more likely not needed)

*references:https://www.youtube.com/watch?v=eH0wZloG2cg&t=1s Flight Booking Algorithm: Steps and Key Systems
* */
public class Main {

    public static void main(String[] args) {
        //Initialing....
        InitialSettings initialSettings =new InitialSettings();
        initialSettings.Initialing();

        //searching(displaying options)
        FlightSearch flightSearch= new FlightSearch();
        flightSearch.FlightDisplay();
        flightSearch.PriceDisplay();

        //make selection
        FlightbBooking a= new FlightbBooking();
        a.MakeSelection();

        //display again for just to check if it changed correctly.
        flightSearch.FlightDisplay();
        a.MakeSelection();

    }

}

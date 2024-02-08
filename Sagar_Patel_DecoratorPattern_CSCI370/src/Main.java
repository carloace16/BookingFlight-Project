import java.util.Scanner;

public class Main {
    public static Seat seat;
    public static Boolean confirm;

    public static void main(String[] args) {
        confirm = true;
        while (confirm) {

            int input;    // to hold day value

            // Create a Scanner object for keyboard input.
            Scanner console = new Scanner(System.in);

            // Get day.
            System.out.println("Please select a number:\n1: Economy Seat\n2: Business Seat\n3: First Class");
            input = console.nextInt();


            switch (input) {
                case 1:
                    seat = new EcoSeat();
                    break;
                case 2:
                    seat = new Business();
                    break;
                case 3:
                    seat = new FirstClass();
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("Would you like to add any meal:\n1: Veg Meal\n2: Non Veg Meal\n3: No Food.");
            int input1 = console.nextInt();

            switch (input1) {
                case 1:
                    seat = new vegFood(seat);
                    break;
                case 2:
                    seat = new nonVegFood(seat);
                    break;
                case 3:
                    System.out.println("No food was added.");
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Would you like to add Extra baggage:\n1: Yes\n2: No\n");
            int input2 = console.nextInt();

            switch (input2) {
                case 1:
                    seat = new ExtraLuggage(seat);
                    break;
                case 2:
                    System.out.println("Extra Baggage was not added.");
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("Would you like a souvenir:\n1: Yes\n2: No\n");
            int input5 = console.nextInt();

            switch (input5) {
                case 1:
                    seat = new souvenir(seat);
                    break;
                case 2:
                    System.out.println("souvenir was not added.");
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println("Would you like an alcoholic Beverage\n1: Yes\n2: No\n");
            int input6 = console.nextInt();

            switch (input6) {
                case 1:
                    seat = new drinks(seat);
                    break;
                case 2:
                    System.out.println("No drink(s) were added.");
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.println(seat.getSeatType());

            System.out.println("Can we confirm this Booking:\n1: Yes\n2: No\n3:Cancel booking");
            int input3 = console.nextInt();

            switch (input3) {
                case 1:
                    System.out.println("Your Booking has been made and your total is $" + seat.cost() + "\nThank you and we are glad to assist you.");
                    break;
                case 2:
                    System.out.println("Thank you. you may edit the booking before confirming.");
                    break;
                case 3:
                    System.out.println("Cancel Booking.");
                    break;
                default:
                    System.out.println("Invalid input");
            }
            if(input3 == 1 || input3 == 3){
                confirm = false;
            }


            //System.out.println(seat.getSeatType() + "Your total is Cost: $2" + seat.cost());


//        System.out.println("Please select a number:\n1: Economy Seat\n2: Business Seat\n3: First Class");
//        Scanner input = new Scanner(System.in);
//        String seat = input.next();
//        switch(input){
//            case 1: new EcoSeat();
//            System.out.println(seat.getSeatType() + "Cost: " + seat.cost());
//        }
//        Seat scanner = new ExtraLuggage(new nonVegFood(new EcoSeat()));
//
//        System.out.println(seat.getSeatType() + "Cost: " + seat.cost());


//        Seat seat = new souvenir(new ExtraLuggage(new nonVegFood(new vegFood(new EcoSeat()))));
//        System.out.println(seat.getSeatType() + "Cost: " + seat.cost());


        }
    }
}
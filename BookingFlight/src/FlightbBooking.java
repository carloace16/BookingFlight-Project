import java.util.Scanner;
//part of the step (2) booking
//The switch statement line28-55 can be using state pattern...
public class FlightbBooking{
    int flightNum;
    int availableSeat;
    int option;
    public void MakeSelection(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Select your flight:");

        // flightNum is the index of Flight List. so we can stick with that flight when booking seats.
        // -1 in order to match with the index (all index start from 0)
        flightNum = myObj.nextInt()-1;

        // availableSeat: add up all values in maps, which is remaining available seats.
        availableSeat= InitialSettings.Flight1.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println("Your selected flight# "+ (flightNum+1)+". ");
        System.out.println(availableSeat+
                " available seats: "+InitialSettings.myList.get(flightNum));

        System.out.println("select your flight class: (1)FirstClass, (2)BusinessClass, (3)EconomyClass ");
        option = myObj.nextInt();

        //The switch statement below can surly change to state pattern...
        switch (option){

            case 1: {if(InitialSettings.myList.get(flightNum).get("FirstClass")==0)
                {System.out.println("Booking failed(Full)");}
                else
                {InitialSettings.myList.get(flightNum).put("FirstClass", InitialSettings.myList.get(flightNum).get("FirstClass")-1);
                    System.out.println("Booked successfully for FirstClass");}
                }
            break;

            case 2: {if(InitialSettings.myList.get(flightNum).get("BusinessClass")==0)
                {System.out.println("Booking failed(Full)");}
                else
                {InitialSettings.myList.get(flightNum).put("BusinessClass", InitialSettings.myList.get(flightNum).get("BusinessClass")-1);
                    System.out.println("Booked successfully for BusinessClass");}
                }
            break;
            case 3: {if(InitialSettings.myList.get(flightNum).get("EconomyClass")==0)
                {System.out.println("Booking failed(Full)");}
                else
                {InitialSettings.myList.get(flightNum).put("EconomyClass", InitialSettings.myList.get(flightNum).get("EconomyClass")-1);
                    System.out.println("Booked successfully for EconomyClass");}
                }
            break;
            default:
                System.out.println("Didn't go though.");

            }


    }
    }


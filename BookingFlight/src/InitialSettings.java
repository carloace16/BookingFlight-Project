import java.util.*;
//part of the step (1) searching a flight

public class InitialSettings{

    //I use linked hash map to store seat info with seat Class as the key, #of available seats as the value.
    //ex: flight1 has value of: maps("FirstClass"=1, "BusinessClass"=1, "EconomyClass"=2) which means flight1 has 2 FirstClass seat, 1 BusinessClass seat, 2 EconomyClass Seat
    //I create List to so stored these maps. List[flight1,flight2..]
    //so, the index on that list can be flight#, and the value of that element is a map that contain the seat info.
    //ex. List[0] has: -name:flight1  -value: a map with seat info for flight -index 0 represent flight number1

    public static List<Map<String,Integer>> myList = new ArrayList<Map<String,Integer>>();
    public static Map<String, Integer> Flight1 = new LinkedHashMap<String, Integer>();
    public static Map<String, Integer> Flight2 = new LinkedHashMap<String, Integer>();

    public void Initialing(){

        System.out.println("Initialing....");
        //I use maps to assign #of seat as the Value. ex: map("FirstClass", 1) FirstClass Seat has 1 spot available)

        //For now, this part have to be modified manually
        this.Flight1.put("FirstClass",1); //Assign 1 FirstClass seat for Flight1.
        this.Flight1.put("BusinessClass",1);//Assign 1 BusinessClass seat for Flight1.
        this.Flight1.put("EconomyClass",2);//Assign 2 EconomyClass seat for Flight1.

        this.Flight2.put("FirstClass",1);//Assign 1 FirstClass seat for Flight2.
        this.Flight2.put("BusinessClass",1);//Assign 1 BusinessClass seat for Flight2.
        this.Flight2.put("EconomyClass",2);//Assign 2 EconomyClass seat for Flight2.
        //

        //add flights to  FlightList.
        this.myList.add(Flight1);
        this.myList.add(Flight2);
    }


}

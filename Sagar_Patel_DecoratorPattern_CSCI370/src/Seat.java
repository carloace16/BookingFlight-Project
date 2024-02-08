public abstract class Seat {
    String seatType = "UNKNOWN";

    public String getSeatType(){

        return seatType;
    }
    public abstract double cost();

}

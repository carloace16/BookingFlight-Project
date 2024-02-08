public class ExtraLuggage extends decoratorClass{
    Seat seat;

    public ExtraLuggage(Seat seat){
        this.seat = seat;
    }

    @Override
    public String getSeatType() {
        return seat.getSeatType() + "Extra Baggage has been added\n";
    }
    public double cost(){
        return seat.cost() + 75.00;
    }
}

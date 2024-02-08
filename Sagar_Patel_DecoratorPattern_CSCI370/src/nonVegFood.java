public class nonVegFood extends decoratorClass{
    Seat seat;

    public nonVegFood(Seat seat){
        this.seat = seat;
    }

    @Override
    public String getSeatType() {
        return seat.getSeatType() + "Non vegetarian meal has been selected\n";
    }
    public double cost(){
        return seat.cost()  + 10.00;
    }
}

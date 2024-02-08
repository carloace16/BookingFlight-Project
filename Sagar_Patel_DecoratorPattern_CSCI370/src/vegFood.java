public class vegFood extends decoratorClass {
    Seat seat;

    public vegFood(Seat seat){
        this.seat = seat;
    }

    @Override
    public String getSeatType() {
        return seat.getSeatType() + "vegetarian meal has been selected.\n";
    }
    public double cost(){
        return seat.cost() + 5.00;
    }

}

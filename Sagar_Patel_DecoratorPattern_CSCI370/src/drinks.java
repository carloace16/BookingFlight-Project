public class drinks extends decoratorClass{
    Seat seat;

    public drinks(Seat seat){
        this.seat = seat;
    }

    @Override
    public String getSeatType() {
        return seat.getSeatType() + "You have added one of our finest bottles of wine.\n";
    }
    public double cost(){
        return seat.cost() + 50.00;
    }
}


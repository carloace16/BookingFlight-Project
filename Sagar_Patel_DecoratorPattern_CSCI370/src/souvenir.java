public class souvenir extends decoratorClass{
    Seat seat;

    public souvenir(Seat seat){
        this.seat = seat;
    }

    @Override
    public String getSeatType() {
        return seat.getSeatType() + "You have added a souvenir.\n";
    }
    public double cost(){
        return seat.cost() + 100.00;
    }
}



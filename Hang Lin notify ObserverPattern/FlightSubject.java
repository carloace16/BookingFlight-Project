import java.util.ArrayList;
import java.util.List;

public class FlightSubject implements Subject{
    private String message;
    private List<Observer> observerList1= new ArrayList<>();
    @Override
    public void addOberver(Observer observer) {
        observerList1.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList1.remove(observer);
    }

    @Override
    public void notifyAll(int numSpotOpen) {
        message="Queens College Airline currently has "+numSpotOpen+" available ticket(s).";
        for(Observer observer:observerList1){
             observer.update(message);}

    }
}

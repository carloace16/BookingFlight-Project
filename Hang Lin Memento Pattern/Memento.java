import java.util.Map;

public class Memento {
    private Map<String, Integer> state;

    public Memento(Map<String, Integer> State){
        this.state=State;
    }

    public Map<String, Integer> getState() {
        return state;
    }

    public void setState(Map<String, Integer> state) {
        this.state = state;
    }
}

import java.util.Map;

public class Originator {
    private Map<String, Integer> state;
    public Originator(){}

    public Map<String, Integer> getState() {
        return state;
    }

    public void setState(Map<String, Integer> state) {
        this.state = state;
    }
    public Memento creatMemento(){
        return new Memento(this.state);
    }
    public void restoreState(Memento memento){
        this.setState(memento.getState());
    }
}

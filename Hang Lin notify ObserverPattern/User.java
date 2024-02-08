public class User implements Observer{
    private String name;
    User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("["+this.name+" received message]:"+ message);
    }
}

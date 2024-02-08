public class CareTaker {
    private static Memento Memento;
    public static void storeMemento(Memento Memento1){
        Memento=Memento1;
    }
    public static Memento getMemento(){
        return Memento;
    }

}

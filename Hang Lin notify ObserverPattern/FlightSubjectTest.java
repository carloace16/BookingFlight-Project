import static org.junit.jupiter.api.Assertions.*;

class FlightSubjectTest {

    @org.junit.jupiter.api.Test
    void addOberver() {

        FlightSubject flightSubject = new FlightSubject();
        flightSubject.addObserver(new User("User1"));
        flightSubject.addObserver(new User("User2"));

        assertTrue(flightSubject.observerList1.size()==2);



    }

    @org.junit.jupiter.api.Test
    void removeObserver() {
        FlightSubject flightSubject = new FlightSubject();
        User user1 = new User("User1");
        User user2 = new User("User2");

        flightSubject.addObserver(user1);
        flightSubject.addObserver(user2);
        flightSubject.removeObserver(user2);


        assertTrue(flightSubject.observerList1.size()==1);
    }

}
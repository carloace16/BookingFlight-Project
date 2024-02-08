import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Scanner;

public class unitTest {
    @Test
    public void NoSeatSelected() {
        Seat seat = new EcoSeat();
        Seat seat1 = new drinks(new EcoSeat());
        assertTrue(seat1.seatType != null );
    }

}




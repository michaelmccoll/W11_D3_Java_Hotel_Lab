import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom room1;
    private Guest guest1;
    private Booking booking1;

    @Before
    public void setUp(){
        room1 = new Bedroom("201",2,"Double");
        guest1 = new Guest("Pete");
        booking1 = new Booking(room1,10,90);
    }

    @Test
    public void canBookRoom(){
        assertEquals(1,booking1.bookRoom(room1));
    }
}


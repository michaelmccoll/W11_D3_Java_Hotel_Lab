import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom room1;
    private ConferenceRoom room2;

    @Before
    public void setUp(){
        room1 = new ConferenceRoom("10",50,"Round");
        room2 = new ConferenceRoom("20",100,"Square");
    }

    @Test
    public void getRoomNumber(){
        assertEquals("10",room1.getRoomNumber());
    }

    @Test
    public void getCapacity(){
        assertEquals(100,room2.getCapacity());
    }

    @Test
    public void getTableType(){
        assertEquals("Round",room1.getTableType());
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom room1;
    private Bedroom room2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp(){
        room1 = new Bedroom("201",2,"Double");
        room2 = new Bedroom("301",1,"Single");
        guest1 = new Guest("Pete");
        guest2 = new Guest("Partner");
    }

    @Test
    public void getRoomNumber(){
        assertEquals("201",room1.getRoomNumber());
    }

    @Test
    public void getCapacity(){
        assertEquals(1,room2.getCapacity());
    }

    @Test
    public void getRoomType(){
        assertEquals("Double",room1.getRoomType());
    }

    @Test
    public void addGuestToRoom(){
        room1.addGuest(guest1);
        assertEquals(1,room1.countGuests());
    }

    @Test
    public void removeGuestFromRoom(){
        room1.addGuest(guest1);
        room1.addGuest(guest2);
        room1.removeGuest(guest1);
        assertEquals(1,room1.countGuests());
    }
}

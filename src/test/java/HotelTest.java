import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom room1;
    private Bedroom room2;
    private Hotel hotel1;
    private Guest guest1;
    private ConferenceRoom confRoom1;
    private ConferenceRoom confRoom2;

    @Before
    public void setUp() {
        room1 = new Bedroom("201", 2, "Double");
        room2 = new Bedroom("301", 1, "Single");
        hotel1 = new Hotel();
        hotel1.addRoomToHotel(room1);
        hotel1.addRoomToHotel(room2);
        guest1 = new Guest("Michael");
        confRoom1 = new ConferenceRoom("10",50,"Round");
        confRoom2 = new ConferenceRoom("20",100,"Square");
        hotel1.addConferenceRoomToHotel(confRoom1);
        hotel1.addConferenceRoomToHotel(confRoom2);
    }

    @Test
    public void addRoomToHotel() {
        assertEquals(2, hotel1.countRooms());
    }

    @Test
    public void addConferenceRoomToHotel() {
        assertEquals(2, hotel1.countConferenceRooms());
    }

    @Test
    public void checkIn(){
        hotel1.checkIn(guest1,room1);
        assertEquals(1,room1.countGuests());
    }

    @Test
    public void checkOut(){
        hotel1.checkIn(guest1,room1);
        hotel1.checkOut(guest1,room1);
        assertEquals(0,room1.countGuests());
    }
}

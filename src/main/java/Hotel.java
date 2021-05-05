import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public void addRoomToHotel(Bedroom room) {
        this.bedrooms.add(room);
    }

    public void addConferenceRoomToHotel(ConferenceRoom room) {
        this.conferenceRooms.add(room);
    }

    public int countRooms() {
        return this.bedrooms.size();
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void checkIn(Guest guest, Bedroom room) {
        if (this.bedrooms.contains(room)){
            room.addGuest(guest);
        }
    }

    public void checkOut(Guest guest, Bedroom room) {
        room.removeGuest(guest);
    }
}

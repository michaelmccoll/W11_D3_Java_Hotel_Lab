import java.util.ArrayList;

public class Bedroom {

    private String roomNumber;
    private Integer capacity;
    private String type;
    private ArrayList<Guest> guestCollection;

    public Bedroom(String roomNumber, Integer capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestCollection = new ArrayList<>();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return type;
    }

    public void addGuest(Guest guest) {
        this.guestCollection.add(guest);
    }

    public int countGuests() {
        return this.guestCollection.size();
    }

    public void removeGuest(Guest guest) {
        this.guestCollection.remove(guest);
    }
}

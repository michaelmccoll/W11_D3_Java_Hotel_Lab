import java.util.ArrayList;

public class ConferenceRoom {

    private String roomNumber;
    private Integer capacity;
    private ArrayList<Guest> guestCollection;
    private String tableType;

    public ConferenceRoom(String roomNumber, Integer capacity, String tableType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.tableType = tableType;
        this.guestCollection = new ArrayList<>();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTableType() {
        return tableType;
    }
}

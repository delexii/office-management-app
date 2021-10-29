package office.management.challenge;

import java.util.ArrayList;

public class Office {

    public ArrayList<String> spaces = new ArrayList<String>();

    public String addRoom(MeetingRoom room) {
        this.spaces.add(room.name);
        return room.name;
    }

    public ArrayList<String> getRooms() {
        return this.spaces;
    }
}

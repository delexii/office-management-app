package office.management.challenge;

import java.util.ArrayList;
import java.util.List;

public class Office {

    ArrayList<MeetingRoom> spaces = new ArrayList<MeetingRoom>();

    public List<MeetingRoom> addRoom(MeetingRoom room) {
        System.out.printf("Room %s was added to your office spaces.\n", room.name);
        spaces.add(new MeetingRoom(room.name));
        return spaces;
    }

    public List<MeetingRoom> getRooms() {
        return spaces;
    }
}

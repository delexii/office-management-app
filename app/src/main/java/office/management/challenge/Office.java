package office.management.challenge;

import java.util.ArrayList;
import java.util.List;

public class Office {

    ArrayList<MeetingRoom> spaces = new ArrayList<MeetingRoom>();
    ArrayList<String> availableSpaces = new ArrayList<String>();

    public List<MeetingRoom> addRoom(MeetingRoom room) {
        System.out.printf("Room %s was added to your office spaces.\n", room.name);
        spaces.add(room);
        return spaces;
    }

    public List<MeetingRoom> getRooms() {
        return spaces;
    }

    public List<String> getAvailableRooms() {

        for (MeetingRoom i : spaces) {
            if (i.available == true && !availableSpaces.contains(i.name)) {
                availableSpaces.add(i.name);
            } else if (i.available == false && availableSpaces.contains(i.name)) {
                availableSpaces.remove(i.name);
            }
        }

        return availableSpaces;
    }
}

package office.management.challenge;

import java.util.ArrayList;

public class Office {

    ArrayList<MeetingRoom> spaces = new ArrayList<MeetingRoom>();

    public MeetingRoom addRoom(MeetingRoom meetingRoom) {
        spaces.add(meetingRoom);
        return meetingRoom;
    }
}

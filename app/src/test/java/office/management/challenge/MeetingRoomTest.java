package office.management.challenge;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MeetingRoomTest {
    @Test
    public void testMeetingRoomHasName() {
        MeetingRoom meetingRoom = new MeetingRoom("Surfers Paradise");
        assertEquals(meetingRoom.getName(), "Surfers Paradise");
    }

    @Test
    public void testMeetingRoomIsAvailable() {
        MeetingRoom meetingRoom = new MeetingRoom("Surfers Paradise");
        assertEquals(meetingRoom.available, true);
        assertEquals(meetingRoom.leaveRoom(), meetingRoom.available);
    }

    @Test
    public void testMeetingRoomIsNotAvailable() {
        MeetingRoom meetingRoom = new MeetingRoom("Surfers Paradise");
        assertEquals(meetingRoom.enterRoom(), meetingRoom.available);
    }
}

package office.management.challenge;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MeetingRoomTest {
    @Test
    public void testMeetingRoomHasName() {
        MeetingRoom meetingRoom = new MeetingRoom("Surfers Paradise");
        assertEquals(meetingRoom.getName(), "Surfers Paradise");
    }
}

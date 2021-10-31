package office.management.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class OfficeTest {
    @Test
    public void testStartsWithEmptyArray() {
        Office office = new Office();
        List<MeetingRoom> roomList = office.getRooms();
        assertTrue(roomList.isEmpty());
    }

    @Test
    public void testOfficeAddsMeetingRoom() {
        Office office = new Office();
        List<MeetingRoom> spaces = office.getRooms();
        office.addRoom(new MeetingRoom("Surfers Paradise"));
        assertEquals(spaces.size(), 1);
    }

    @Test
    public void testOfficeGetsAllRooms() {
        MeetingRoom room1 = new MeetingRoom("Surfers Paradise");
        MeetingRoom room2 = new MeetingRoom("Surfers Paradise");
        Office office = new Office();
        office.addRoom(room1);
        office.addRoom(room2);
        assertEquals(office.getRooms().isEmpty(), false);
        assertEquals(office.getRooms().size(), 2);
    }
}

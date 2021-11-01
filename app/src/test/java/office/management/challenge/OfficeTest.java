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
        MeetingRoom room2 = new MeetingRoom("Gold Coast");
        Office office = new Office();
        office.addRoom(room1);
        office.addRoom(room2);
        assertEquals(office.getRooms().isEmpty(), false);
        assertEquals(office.getRooms().size(), 2);
    }

    @Test
    public void testUserCanSeeAllAvailableRooms() {
        Office office = new Office();
        MeetingRoom room1 = new MeetingRoom("Surfers Paradise");
        MeetingRoom room2 = new MeetingRoom("Gold Coast");
        office.addRoom(room1);
        office.addRoom(room2);
        room2.enterRoom();
        List<String> availableSpaces = office.getAvailableRooms();
        assertEquals(room2.available, false);
        assertEquals(office.spaces.size(), 2);
        assertEquals(availableSpaces.size(), 1);
    }
}

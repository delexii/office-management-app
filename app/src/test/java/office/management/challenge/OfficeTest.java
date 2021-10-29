package office.management.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OfficeTest {
    @Test
    public void testOfficeAddsMeetingRoom() {
        MeetingRoom room = new MeetingRoom("Surfers Paradise");
        Office office = new Office();
        assertEquals(office.addRoom(room), "Surfers Paradise");
    }

    @Test
    public void testOfficeGetsAllRooms() {
        MeetingRoom room = new MeetingRoom("Surfers Paradise");
        Office office = new Office();
        assertEquals(office.addRoom(room), "Surfers Paradise");
        assertEquals(office.getRooms().isEmpty(), false);
        assertEquals(office.getRooms().size(), 1);
    }
}

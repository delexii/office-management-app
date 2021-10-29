package office.management.challenge;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class OfficeTest {
    @Test
    public void testOfficeAddsMeetingRoom() {
        MeetingRoom room1 = new MeetingRoom("Surfers Paradise");
        Office office = new Office();
        assertEquals(office.addRoom(room1), room1);
    }
}

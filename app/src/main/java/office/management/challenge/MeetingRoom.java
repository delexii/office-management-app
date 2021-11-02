package office.management.challenge;

public class MeetingRoom {

    String name;
    Boolean available;

    public MeetingRoom(String name) {
        this.name = name;
        this.available = true;
    }

    public String getName() {
        return this.name;
    }

    public Boolean enterRoom() {
        return available = false;
    }

    public Boolean leaveRoom() {
        return available = true;
    }
}

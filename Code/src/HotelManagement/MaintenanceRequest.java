package HotelManagement;

public class MaintenanceRequest {
    private Room room;
    private String issueDescription;
    private String requestDate;

    public MaintenanceRequest(Room room, String issueDescription, String requestDate) {
        this.room = room;
        this.issueDescription = issueDescription;
        this.requestDate = requestDate;
    }

    public Room getRoom() {
        return room;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public String getRequestDate() {
        return requestDate;
    }
}

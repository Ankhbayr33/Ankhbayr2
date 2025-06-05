package HotelManagement;

public class Event {
    private String name;
    private String date;
    private int capacity;

    public Event(String name, String date, int capacity) {
        this.name = name;
        this.date = date;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getCapacity() {
        return capacity;
    }
}


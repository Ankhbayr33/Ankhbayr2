package HotelManagement;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;
    private List<Service> services;
    private List<Vehicle> vehicles;
    private List<Event> events;
    private List<MaintenanceRequest> maintenanceRequests;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.services = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.events = new ArrayList<>();
        this.maintenanceRequests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Service> getServices() {
        return services;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<MaintenanceRequest> getMaintenanceRequests() {
        return maintenanceRequests;
    }
}

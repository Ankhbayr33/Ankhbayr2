package HotelManagement;

import java.util.*;

public class HotelManagementApp {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Tanii zocid buudal:");
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;

        // ✅ Өрөө сонгох
        System.out.println("==== Manai HH zocid buudald tavtai morilno uu ! =====");
        System.out.print("Oroonii dugaaraa oruulna uu: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Oroonii torloo songono uu:");
        System.out.println("1. 1 ortoi (100$)");
        System.out.println("2. 2 ortoi (150$)");
        System.out.println("3. 3 ortoi (200$)");
        System.out.println("4. 4 ortoi(250$)");
        int roomChoice = scanner.nextInt();
        scanner.nextLine();

        String roomType = "";
        double roomPrice = 0.0;

        switch (roomChoice) {
            case 1 -> { roomType = "1 оrtoi"; roomPrice = 100; }
            case 2 -> { roomType = "2 оrtoi"; roomPrice = 150; }
            case 3 -> { roomType = "3 ortoi"; roomPrice = 200; }
            case 4 -> { roomType = "4 ortoi"; roomPrice = 250; }
            default -> { System.out.println("Buruu songolt!"); return; }
        }

        Room room = new Room(roomNumber, roomType);
        hotel.getRooms().add(room);
        totalPrice += roomPrice;

        // ✅ Үйлчилгээ нэмэх эсэх
        System.out.print("Uilcilgee zahialah uu? (true/false): ");
        boolean addService = scanner.nextBoolean();
        scanner.nextLine();

        if (addService) {
            System.out.print("Uilcilgeeni ner: ");
            String serviceName = scanner.nextLine();
            System.out.print("Uilcilgeeni une: ");
            double servicePrice = scanner.nextDouble();
            scanner.nextLine();
            Service service = new Service(serviceName, servicePrice);
            hotel.getServices().add(service);
            totalPrice += servicePrice;
        }

        // ✅ Тээврийн хэрэгсэл нэмэх эсэх
        System.out.print("Teevriin heregsel heregtei yu? (true/false): ");
        boolean addVehicle = scanner.nextBoolean();
        scanner.nextLine();

        if (addVehicle) {
            System.out.print("Teevriin heregsliin torol: ");
            String vehicleType = scanner.nextLine();
            Vehicle vehicle = new Vehicle(vehicleType);
            hotel.getVehicles().add(vehicle);
            totalPrice += 25; // Жишээ үнэ
        }

        // ✅ Үйл явдал нэмэх эсэх
        System.out.print("Event zahialah uu? (true/false): ");
        boolean addEvent = scanner.nextBoolean();
        scanner.nextLine();

        if (addEvent) {
            System.out.print("Event iin ner: ");
            String eventName = scanner.nextLine();
            System.out.print("Ognoo (YYYY-MM-DD): ");
            String eventDate = scanner.nextLine();
            System.out.print("Bagtaamj: ");
            int capacity = scanner.nextInt();
            scanner.nextLine();
            Event event = new Event(eventName, eventDate, capacity);
            hotel.getEvents().add(event);
            totalPrice += 30; // Жишээ үнэ
        }

        // ✅ Засвар үйлчилгээ нэмэх эсэх
        System.out.print("Zasvar uilcilgee zahialah uu? (true/false): ");
        boolean addMaintenance = scanner.nextBoolean();
        scanner.nextLine();

        if (addMaintenance) {
            System.out.print("Asuudliin tailbar: ");
            String issueDescription = scanner.nextLine();
            System.out.print("Huseltiin ognoo (YYYY-MM-DD): ");
            String requestDate = scanner.nextLine();
            MaintenanceRequest request = new MaintenanceRequest(room, issueDescription, requestDate);
            hotel.getMaintenanceRequests().add(request);
        }

        // ✅ Хэвлэх тохиргоо
        System.out.print("Delgerengui medeelel hevleh uu? (true/false): ");
        boolean printDetails = scanner.nextBoolean();

        System.out.println("\n===========================");
        System.out.println("Zahialiin negtgel:");
        System.out.println("Oroo №: " + room.getRoomNumber() + ", Torol: " + roomType + ", Une: " + roomPrice + "$");

        if (printDetails) {
            if (addService) {
                Service s = hotel.getServices().get(0);
                System.out.println("Uilcilgee: " + s.getName() + " - " + s.getPrice() + "$");
            }
            if (addVehicle) {
                Vehicle v = hotel.getVehicles().get(0);
                System.out.println("Teevriin heregsel: " + v.getType() + " - 25$");
            }
            if (addEvent) {
                Event e = hotel.getEvents().get(0);
                System.out.println("Uil yvdal: " + e.getName() + " - 30$");
            }
        }

        System.out.println("Niit une: " + totalPrice + "$");
        System.out.println("===========================");
        scanner.close();
    }
}


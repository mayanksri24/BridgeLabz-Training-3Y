// Superclass: Device
class Device {
    String deviceId;
    String status;

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    double temperatureSetting;

    // Constructor calls superclass constructor (Device)
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus() to add temperature info
    @Override
    void displayStatus() {
        super.displayStatus();  // Call Device’s method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main Class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH-101", "ON", 24.5);
        t1.displayStatus();
    }
}

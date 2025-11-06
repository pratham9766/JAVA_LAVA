import java.util.Scanner;

class Vehicledemo {
    int vehicleId;
    String brand;
    String model;
    double price;
    
    void setDetails(int id, String b, String m, double p) {
        vehicleId = id;
        brand = b;
        model = m;
        price = p;
    }
    
    void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicledemo v1 = new Vehicledemo();
        Vehicledemo v2 = new Vehicledemo();
        
        v1.setDetails(101, "Tesla", "Model S", 79999.99);
        v2.setDetails(102, "Toyota", "Fortuner", 45000.50);
        
        System.out.println("Vehicle Details:\n");
        v1.displayDetails();
        v2.displayDetails();
    }
}

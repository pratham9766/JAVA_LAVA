package appli;

abstract class Appliance {
    String brand;
    double price;

    Appliance(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    abstract void turnOn();

    void getDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class WashingMachine extends Appliance {
    WashingMachine(String brand, double price) {
        super(brand, price);
    }

    void turnOn() {
        System.out.println("Washing Machine is now ON. Ready to wash clothes!");
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String brand, double price) {
        super(brand, price);
    }

    void turnOn() {
        System.out.println("Refrigerator is now ON. Cooling started!");
    }
}

public class ApplianceDemo {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG", 35000);
        Refrigerator rf = new Refrigerator("Samsung", 45000);

        System.out.println("--- Washing Machine Details ---");
        wm.getDetails();
        wm.turnOn();

        System.out.println("\n--- Refrigerator Details ---");
        rf.getDetails();
        rf.turnOn();
    }
}


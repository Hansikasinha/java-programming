// Base class
class Transport {
    void move() {
        System.out.println("The transport is moving.");
    }
}

// Subclass Bus
class Bus extends Transport {
    void carryPassengers() {
        System.out.println("The bus is carrying passengers.");
    }
}

// Subclass Truck
class Truck extends Transport {
    void carryGoods() {
        System.out.println("The truck is carrying goods.");
    }
}

// Main class
public class TransportDemo {
    public static void main(String[] args) {
        // Create Bus object
        Bus bus = new Bus();
        bus.move();               // inherited from Transport
        bus.carryPassengers();    // specific to Bus

        System.out.println();

        // Create Truck object
        Truck truck = new Truck();
        truck.move();             // inherited from Transport
        truck.carryGoods();       // specific to Truck
    }
}


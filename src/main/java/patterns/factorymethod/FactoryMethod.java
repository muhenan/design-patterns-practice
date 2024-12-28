package patterns.factorymethod;

// Product interface
interface Transport {
    void deliver();
    void calculateCost(int distance);
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck");
    }

    @Override
    public void calculateCost(int distance) {
        double cost = distance * 2.5; // $2.5 per km
        System.out.println("Truck delivery cost: $" + cost);
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a cargo ship");
    }

    @Override
    public void calculateCost(int distance) {
        double cost = distance * 4.0; // $4.0 per km
        System.out.println("Ship delivery cost: $" + cost);
    }
}

// Abstract factory class
abstract class TransportFactory {
    // Factory method
    abstract Transport createTransport();

    // Business logic
    public void planDelivery(int distance) {
        Transport transport = createTransport();
        transport.deliver();
        transport.calculateCost(distance);
    }
}

// Concrete factories
class TruckFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}

class ShipFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}

// Test class
public class FactoryMethod {
}

package patterns.creational.abstractfactory;

// Abstract products
interface Chair {
    void sitOn();
}

interface Table {
    void putOn();
}

// Concrete products for Modern style
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on modern chair");
    }
}

class ModernTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting items on modern table");
    }
}

// Concrete products for Victorian style
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian chair");
    }
}

class VictorianTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting items on Victorian table");
    }
}

// Abstract factory interface
interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}

// Concrete factories
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}

public class AbstractFactory {
}

package patterns.creational.abstractfactory;

// Client code
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // Create a modern furniture set
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        System.out.println("Testing modern furniture:");
        modernChair.sitOn();
        modernTable.putOn();

        // Create a Victorian furniture set
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        System.out.println("\nTesting Victorian furniture:");
        victorianChair.sitOn();
        victorianTable.putOn();
    }
}

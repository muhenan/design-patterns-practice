package patterns.creational.singleton;

public class Singleton {
    private static Singleton instance; // step 1

    // Private constructor to prevent instantiation
    private Singleton() { } // step 2

    public static Singleton getInstance() { // step 3
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

package patterns.creational.singleton;

public class ThreadSafeSingleton {
    // The volatile keyword ensures that multiple threads handle the instance variable correctly
    private static volatile ThreadSafeSingleton instance;

    // Private constructor to prevent instantiation
    private ThreadSafeSingleton() { }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
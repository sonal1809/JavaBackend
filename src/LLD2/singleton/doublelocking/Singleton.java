package LLD2.singleton.doublelocking;

public class Singleton {

    // Static variable to store the instance and assign null
    // As the function is going to be static, we need to make this variable static
    private static Singleton instance = null;

    // Constructor should be private
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Static method as no instance should be required to call this method
    public static Singleton getInstance() {
        if (instance == null) {  // First check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) {  // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // 🛡 Prevents creating new object during deserialization
    protected Object readResolve() {
        return instance;
    }
}



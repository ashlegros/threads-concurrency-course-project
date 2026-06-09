// Class: Water
// Represent drinking water action for Contender class to utilize after iretable action
public class Water {

    // Custom method: drink() - simulates drinking water
    public static synchronized void drink(String name) {
        System.out.println(name + " is drinking Water!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Drinking was interrupted!");
        }
        System.out.println(name + " is done drinking!");
    }
}

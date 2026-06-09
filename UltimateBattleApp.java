// Ashbel Legros
// Course: COP 3330C - 23598
// Date: 02/21/26
// Application to demonstrate a pushup battle between two individual using OOP concept Concurrency

public class UltimateBattleApp {
    public static void main(String[] args) {
        // Contender Instances with water Instance
        Water water = new Water();
        Contender logan = new Contender("Logan", water);
        Contender peter = new Contender("Peter", water);

        // Setting the attributes (Who is stronger? Who needs less rest?)
        logan.setPushUps(10);
        logan.setMaxRestTime(2000);
        logan.setPushUpCounter(0);

        peter.setPushUps(25);
        peter.setMaxRestTime(5000);
        peter.setPushUpCounter(0);

        // Generate thread for both contender objects
        Thread contender1 = new Thread(logan);
        Thread contender2 = new Thread(peter);

        // Make sure threads are not daemon
        contender1.setDaemon(false);
        contender2.setDaemon(false);

        // Run the threads
        contender1.start();
        contender2.start();

    }
}

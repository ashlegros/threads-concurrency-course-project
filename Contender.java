// Class : Contender
// Represents a contender for the battle of my choosing: Pushups!

import java.util.Random;
import static java.lang.Thread.sleep;

public class Contender implements Runnable {
    // Attributes
    private String name;
    private int pushUps;
    private int pushUpCounter;
    private int maxRestTime;
    private static boolean winner = false;

    // Constructor
    public Contender(String name, Water water) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPushUps() {
        return pushUps;
    }

    public void setPushUps(int pushUps) {
        this.pushUps = pushUps;
    }

    public int getPushUpCounter() {
        return pushUpCounter;
    }

    public void setPushUpCounter(int pushUpCounter) {
        this.pushUpCounter = pushUpCounter;
    }

    public int getMaxRestTime() {
        return maxRestTime;
    }

    public void setMaxRestTime(int maxRestTime) {
        this.maxRestTime = maxRestTime;
    }

    public static boolean isWinner() {
        return winner;
    }

    public static void setWinner(boolean winner) {
        Contender.winner = winner;
    }

    public void run() {

        // Loop to incorporate algorithm of contender performing pushups and resting
        while(true) {
            // A. Have random rest time between 1 and maxRestTime (inclusive)
            int randomRestTime;
            randomRestTime = new Random().nextInt(maxRestTime) + 1;
            try {
                sleep(randomRestTime);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            // B. perform iretable action as well as drink() method
            pushUpCounter += pushUps;
            Water.drink(getName());

            // C. display running total
            System.out.println(getName() + ": " + getPushUpCounter() + " push ups!");

            // D. Check if the contender has won and break out of loop if so
            if (pushUpCounter == 200){
                winner = true;
                System.out.println(getName() + " is the winner!");
                break;
            }
        }
        System.exit(0);
    }
}

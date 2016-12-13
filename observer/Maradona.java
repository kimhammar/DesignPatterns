package observer;

/**
 * Created by kimha on 12/12/16.
 */
public class Maradona implements Observer {
    @Override
    public void update(Signal signal) {

        System.out.println("Maradona says:");
        if (Signal.FREE_KICK.equals(signal)) {
            System.out.println("Wasnt me");
        } else if (Signal.RED_CARD.equals(signal)) {
            System.out.println("Noooooooooooo");
        } else if (Signal.GOAL.equals(signal)) {
            System.out.println("Hand solves");
        } else {
            System.out.println("???????????");
        }
    }
}

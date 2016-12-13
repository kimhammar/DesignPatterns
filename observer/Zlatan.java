package observer;

/**
 * Created by kimha on 12/12/16.
 */
public class Zlatan implements Observer {


    @Override
    public void update(Signal signal) {
        System.out.println("Zlatan says:");
        if (Signal.FREE_KICK.equals(signal)) {
            System.out.println("Käften");
        } else if (Signal.RED_CARD.equals(signal)) {
            System.out.println("Asså han filma");
        } else if (Signal.GOAL.equals(signal)) {
            System.out.println("King is bak");
        } else {
            System.out.println("Vad?");
        }
    }

}

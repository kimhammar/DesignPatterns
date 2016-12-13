package observer;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by kimha on 12/12/16.
 */
public class SnoopDogg implements Subject {

    private Set<Observer> observerList = new HashSet<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() throws InterruptedException {

        while (true) {
            int random = new Random().nextInt(3);
            Signal signal = random == 0 ? Signal.FREE_KICK : random == 1 ? Signal.RED_CARD : Signal.GOAL;
            System.out.println(String.format("Next action is [%s]", signal));
            for (Observer observer : observerList) {
                observer.update(signal);
            }
            System.out.println("----------------");
            Thread.sleep(2000);
        }
    }
}

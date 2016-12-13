package observer;

/**
 * Created by kimha on 12/12/16.
 */
public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers() throws InterruptedException;
}

package observer;

/**
 * Created by kimha on 12/12/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Zlatan zlatan = new Zlatan();
        Maradona maradona = new Maradona();
        SnoopDogg snoopDogg = new SnoopDogg();

        snoopDogg.add(zlatan);
        snoopDogg.add(maradona);
        snoopDogg.notifyObservers();
    }
}

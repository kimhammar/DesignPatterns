package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by kimha on 12/13/16.
 */
public class Henke implements Visitor {
    private List<Visitable> placesToVisit = new ArrayList<>();
    public List<String> funStuff = new ArrayList<>();
    public int totalAmount;

    public void addPlace(Visitable visitable) {
        placesToVisit.add(visitable);
    }


    public void goParty() {
        for (Visitable place : placesToVisit) {
            place.accept(this);
        }
    }

    @Override
    public void visit(Dealer dealer) {
        if (dealer.getPrice() < 200) {
            funStuff.add("Henke is too fabulous for " +
                    " this event, no money spent here!");
        } else {
            funStuff.add(dealer.sellGoodies());
            totalAmount += dealer.getPrice();
        }
    }

    @Override
    public void visit(StripClub stripClub) {
        funStuff.add(stripClub.sellLapdance());
        totalAmount += stripClub.getLapdancePrice();
        if (new Random().nextInt(10) > 3) {
            funStuff.add("Henke is in a good mood! He revisits!");
            funStuff.add(stripClub.sellLapdance());
            totalAmount += stripClub.getLapdancePrice();
        }
    }
}

package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimha on 12/13/16.
 */
public class Ricky implements Visitor {

    private List<Visitable> placesToVisit = new ArrayList<>();
    public List<String> funStuff = new ArrayList<>();
    public int totalAmount;

    public void addPlace(Visitable visitable){
        placesToVisit.add(visitable);
    }



    public void goParty(){
        for (Visitable place : placesToVisit){
            place.accept(this);
        }
    }

    @Override
    public void visit(Dealer dealer) {
        funStuff.add(dealer.sellGoodies());
        totalAmount += dealer.getPrice();
    }

    @Override
    public void visit(StripClub stripClub) {
        funStuff.add(stripClub.sellLapdance());
        totalAmount += stripClub.getLapdancePrice();
    }

}

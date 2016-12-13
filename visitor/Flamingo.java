package visitor;

/**
 * Created by kimha on 12/13/16.
 */
public class Flamingo implements Visitable, StripClub {

    private String name = "Flamingo";
    private String item = "Lapdance";
    public int price = 300;


    @Override
    public int getLapdancePrice() {
        return price;
    }

    @Override
    public String sellLapdance() {
        return toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString() {
        return String.format("Club %s sold you a %s for %d bucks", name, item, price);
    }
}

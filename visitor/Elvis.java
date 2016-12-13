package visitor;

/**
 * Created by kimha on 12/13/16.
 */
public class Elvis implements Visitable,Dealer {

    private String name = "Elvis";
    private String item = "Cocaine";
    private int price = 1100;

    @Override
    public String sellGoodies() {
        return toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s sold you %s for %d bucks", name, item, price);
    }
}

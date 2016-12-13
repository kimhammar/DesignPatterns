package visitor;

/**
 * Created by kimha on 12/13/16.
 */
public class Obama implements Visitable, Dealer {

    private String name = "Obama";
    private String item = "Marijuana";
    private int price = 150;


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String sellGoodies() {
        return toString();
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

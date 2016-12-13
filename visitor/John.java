package visitor;

/**
 * Created by kimha on 12/13/16.
 */
public class John implements Visitable, Dealer {

    private String name = "John";
    private String item = "LSD";
    public int price = 300;

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

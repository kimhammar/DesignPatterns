package visitor;

/**
 * Created by kimha on 12/13/16.
 */
public interface Visitable {
    void accept(Visitor visitor);
}

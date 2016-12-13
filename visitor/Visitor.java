package visitor;

/**
 * Created by kimha on 12/13/16.
 */
public interface Visitor {
    void visit(Dealer dealer);

    void visit(StripClub stripClub);
}

import com.google.common.collect.ImmutableList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Arnon on 14/03/2017.
 */
public class Order {
    public Dollars total() {
        throw new NotImplementedException();
    }

    public OrderStatus status() {
        throw new NotImplementedException();
    }

    public ImmutableList<OrderLine> details() {
        throw new NotImplementedException();
    }
}

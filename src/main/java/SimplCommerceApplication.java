import com.google.common.collect.ImmutableList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Arnon on 13/03/2017.
 */
public class SimplCommerceApplication {
    public ImmutableList<Order> orders() {
        throw new NotImplementedException();
    }

    public ProductsList products() {
        throw new NotImplementedException();
    }

    public void purchaseItem(Product product, int quantity) {
        throw new NotImplementedException();
    }
}

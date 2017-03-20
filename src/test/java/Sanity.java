import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Arnon on 13/03/2017.
 */
public class Sanity {

    @Test
    public void whenACustomerPurchasesAProductAPendingOrderIsCreatedWithTheProductDetailsAndPrice()
    {
        SimplCommerceApplication app = application();

        int initialOrderCount = app.orders().size();
        Product newProduct = app.products().createNew(Money.dollars(20));

        app.purchaseItem(newProduct, 1);

        Assert.assertEquals(initialOrderCount+1, app.orders().size());
        Order lastOrder = Iterables.getLast(app.orders());
        Assert.assertEquals(Money.dollars(20), lastOrder.total());
        Assert.assertEquals(OrderStatus.PENDING, lastOrder.status());
        ImmutableList<OrderLine> orderDetails = lastOrder.details();
        Assert.assertEquals(1, orderDetails.size());
        Assert.assertEquals(newProduct, orderDetails.get(0).product());
        Assert.assertEquals(1, orderDetails.get(0).quantity());
    }

    private SimplCommerceApplication application() {
        return new SimplCommerceApplication();
    }
}

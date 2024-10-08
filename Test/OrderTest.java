import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class OrderTest {

    Product product1, product2;
    Order order1;

    @BeforeEach
    public void setUp() {
        product1 = new Product("Coco",400);
        product2 = new Product("Canela",200);
    }

    @Test
    public void testQuantity() {
        Order order = new Order();
        assertEquals(0, order.quantity(), "La orden deberia estar vacia al crearla");
        order.addProduct(product1);
        assertEquals(1, order.quantity());
        order.addProduct(product2);
        assertEquals(2, order.quantity());
    }

    @Test
    public void testTotal() {
        Order order = new Order();
        assertEquals(0, order.total(), "La orden deberia estar vacia al crearla");
        order.addProduct(product1);
        assertEquals(400, order.total());
        order.addProduct(product2);
        assertEquals(600, order.total());
    }
    @Test
    public void testPayPalPay() {
        PaymentProvider pay = new PayPalProvider();
        assertDoesNotThrow(() -> {
            order1.pay(pay);
        });
    }

    @Test
    public void testInvalidPay() {
        PaymentProvider inv = new UnfundedProvider();
        PayException exception = assertThrows(PayException.class, () -> {
            order1.pay(inv);
        });
        assertEquals(exception.getMessage(), "No tienes fondos para pagar");
    }
}
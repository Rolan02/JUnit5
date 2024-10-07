import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class OrderTest {

    @Test
    public void testQuantity() {
        Product product1 = new Product("Coco",400);
        Product product2 = new Product("Canela",200);

        Order order = new Order();
        assertEquals(0, order.quantity(), "La orden deberia estar vacia al crearla");
        order.addProduct(product1);
        assertEquals(1, order.quantity());
        order.addProduct(product2);
        assertEquals(2, order.quantity());
    }

    @Test
    public void testTotal() {
        Product product1 = new Product("Coco",400);
        Product product2 = new Product("Canela",200);

        Order order = new Order();
        assertEquals(0, order.total(), "La orden deberia estar vacia al crearla");
        order.addProduct(product1);
        assertEquals(400, order.total());
        order.addProduct(product2);
        assertEquals(600, order.total());
    }


}
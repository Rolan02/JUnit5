import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testName() {
        Product product = new Product("Jamon", 200);
        assertEquals("Jamon", product.name());
    }
}
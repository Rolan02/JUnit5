import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testName() {
        Product product = new Product("Jamon", 200);
        assertAll(
                () -> assertEquals("Jamon", product.name()),
                () -> assertEquals(200, product.price())
        );
    }
    @Test
    public void testTimeOut() {
        assertTimeout(Duration.ofMillis(200),
                () -> Thread.sleep(1000)
        );
    }
    @Test
    public void testArray() {
        int[] arrUno = new int[] {1,4,9,16,25};
        int[] arrDos = new int[] {1,4,9,16,25};
        assertArrayEquals(arrUno, arrDos);
    }
}
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LifeCycleTest {

    @BeforeAll
    public static void initAll() {
        System.out.println("=== BEFORE_ALL ===");
    }
    @AfterAll
    public static void endAll() {
        System.out.println("=== AFTER_ALL ===");
    }
    @BeforeEach
    public void init() {
        System.out.println("::: BEFORE_EACH :::");
    }
    @AfterEach
    public void end() {
        System.out.println("::: AFTER_EACH :::");
    }
    @Test
    @Order(1)
    public void testUno() {
        System.out.println("::: TEST_UNO :::");
    }
    @Test
    @Order(2)
    public void testDos() {
        System.out.println("::: TEST_DOS :::");
    }
    @Test
    @Order(3)
    public void testTres() {
        System.out.println("::: TEST_TRES :::");
    }
}

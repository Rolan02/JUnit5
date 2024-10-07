import org.junit.jupiter.api.*;

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
    public void testUno() {
        System.out.println("::: TEST_UNO :::");
    }
    @Test
    public void testDos() {
        System.out.println("::: TEST_DOS :::");
    }
}

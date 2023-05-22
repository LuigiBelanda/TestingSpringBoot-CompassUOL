package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);

        Franc product = five.times(2);
        assertEquals(new Franc(10), product);

        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void TestEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }
}

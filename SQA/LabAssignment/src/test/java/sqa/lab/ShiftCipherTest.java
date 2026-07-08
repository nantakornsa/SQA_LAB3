package sqa.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShiftCipherTest {

    @Test
    public void TC01() {
        ShiftCipher cipher = new ShiftCipher();
        String actual = cipher.shift("SOFTWARE", 3);
        assertEquals("ZVMADHYL", actual);
    }

    @Test
    public void TC02() {
        ShiftCipher cipher = new ShiftCipher();
        String actual = cipher.shift("software", 3);
        assertEquals("zvmadhyl", actual);
    }
    
    @Test
    public void TC03() {
        ShiftCipher cipher = new ShiftCipher();
        String actual = cipher.shift("APPLE", 3);
        assertEquals("DSSOH", actual);
    }

    @Test
    public void TC04() {
        ShiftCipher cipher = new ShiftCipher();
        String actual = cipher.shift("apple", 3);
        assertEquals("dssoh", actual);
    }
}
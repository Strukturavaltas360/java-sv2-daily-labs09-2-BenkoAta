package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void encrypts() {
        assertEquals("0123", new Caesar(30).encrypts("0123"));
        assertEquals("0123", new Caesar(-20).encrypts("0123"));
        assertEquals("2345", new Caesar(2).encrypts("0123"));
        assertEquals("8901", new Caesar(-2).encrypts("0123"));

        assertEquals("bcde", new Caesar(3 * 26).encrypts("bcde"));
        assertEquals("bcde", new Caesar(-2 * 26).encrypts("bcde"));
        assertEquals("zabc", new Caesar(24).encrypts("bcde"));
        assertEquals("zabc", new Caesar(-2).encrypts("bcde"));

        assertEquals("BCDE", new Caesar(3 * 26).encrypts("BCDE"));
        assertEquals("BCDE", new Caesar(-2 * 26).encrypts("BCDE"));
        assertEquals("ZABC", new Caesar(24).encrypts("BCDE"));
        assertEquals("ZABC", new Caesar(-2).encrypts("BCDE"));

        assertEquals(".,-()", new Caesar(1).encrypts(".,-()"));
    }
}
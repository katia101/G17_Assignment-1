package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static java.time.Duration.ofMinutes;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
class birthdayTest {
    private birthday assess;
    private birthday assessment;
    private birthday assign;
    @BeforeEach
    void setUp() {
        assess = new birthday();
        assessment = new birthday();
        assign = assess;

    }

    @Test
    void testEquality()
    {
        assertEquals(assess, assign);
    }

    @Test
    void testIdentity()
    {
        assertSame(assess, assign);
    }

    @Test
    void testFailure()
    {
        assertFalse(false);
    }


    @Test
    void testTimeout()
    {
        assertTimeout(ofMinutes(1), () -> {});
    }
}
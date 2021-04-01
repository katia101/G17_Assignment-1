package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static java.time.Duration.ofMinutes;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class Assignment1Test {
    private Assignment1 assess;
    private Assignment1 assessment;
    private Assignment1 assign;
    @BeforeEach
    void setUp() {
        assess = new Assignment1();
        assessment = new Assignment1();
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
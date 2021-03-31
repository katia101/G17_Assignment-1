package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This is a small program
 * Author: Ottor Ncedo 218052200
 * Date: 31 March 2021
 */

class PersonTest {

    private Person person1;
    private Person person2;
    private Person person3;

    @BeforeEach
    void setUp() {
        person1 = new Person();
        person2 = new Person();
        person3 = person1;

    }

    @Test
    void testIdentity() {

        assertSame(person1,person3);
    }


    @Test
    void testEquality() {
        assertEquals(person1,person3);

    }


    @Test
    void getFirstName() {
        assertEquals(person1,person3);
        fail("this will fail");
    }

    @Disabled("This test is disabled")
    @Test
    public void setLastName() {
        assertNotEquals(person1,person2);
    }

    @Test
    void timeoutExceeded() {

        assertTimeout(Duration.ofMinutes(1), () ->{
            //Thread.sleep(100);
        });
    }
}
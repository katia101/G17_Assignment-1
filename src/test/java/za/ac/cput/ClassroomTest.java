package za.ac.cput;
//Panashe Muinzani_218186568//
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

    private Classroom girl;
    private Classroom boy;
    private Classroom sarah;
    private Classroom luther;


    @BeforeEach
    void setUp() {
        girl = new Classroom();
        boy = new Classroom();
        girl = sarah;
        boy = luther;

    }

    @Test
    void testIdentity() {
        assertEquals(girl, sarah);
    }

    @Test
    void testEquality() {
        assertSame(boy, luther);
    }

    @Test
    void testFailing() {
        fail("test should fail");
        assertEquals(girl, sarah);
    }

    @Test
    @Disabled("Disabled until futher notice")
    void testDisable() {
        assertSame(boy, luther);
    }

}
package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rect;

    @BeforeEach
    void setUp() throws Exception {
        rect = new Rectangle();
    }
    //Testing Equality
    @Test
    void rectangleEquality(){
        int result = rect.Rectangle(2,6);
        assertEquals(12,result);
    }
    //Testing Identity
    @Test
    void rectangleIdentity(){
        int result = rect.Rectangle(2,6);
        assertSame(12,result);
        System.out.println("Identified");
    }
    @Test
    void rectangleFailing(){
        int result = rect.Rectangle(2,6);
        fail("this is failing");
    }
    @Test
    @Timeout(100)
    void rectangleTimeout(){
        int result = rect.Rectangle(2,6);
        assertEquals(12,result);
        System.out.println("On time");
    }
    @Test
    @Disabled
    void rectangleDisabling(){
        int result = rect.Rectangle(2,6);
        assertEquals(12,result);
        System.out.println("Disabled");
    }




}
package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NewBankAccountTest {
   private NewBankAccount bank ;
    private NewBankAccount bankAccount;
    private NewBankAccount Test;

    @BeforeEach
    void setUp() {
        bank = new NewBankAccount();
        bankAccount = new NewBankAccount();
        Test = bank;
    }

    @Test
    void testIdentity(){
    assertSame(bank, Test);
    }

    @Test
    void testEquality(){
        assertEquals(bank, Test);
    }

    @Test
    void testFail(){
        assertFalse(false);
    }

    @Test
    void testTimeOut(){
    assertTimeout(ofMinutes(2),() -> {

    });
    }

    @Test
    @Disabled()
    void testDisable(){
        testEquality();
        testFail();
        testIdentity();
        testTimeOut();
    }

}
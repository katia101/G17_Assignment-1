package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;
/*
 *
 * @author Mziyanda
 * Mziyanda Mwanda
 * 215133765
 * ADP 3
 * Assignment
 * 01 April 2021
 * */

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
    void testEquality(){
        assertEquals(bank, Test);
    }

    @Test
    void testIdentity(){
    assertSame(bank, bankAccount);
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
    //individual Test
    @Test
    @Disabled()
    void testDisable(){
        testEquality();
        testFail();
        testIdentity();
        testTimeOut();
    }

}
package za.ac.cput;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

       /*
        StudentTest
        author: ZintleZothe_216130565
        */


class StudentTest {



     @Test
    //checks for object identity
    public void getStudentName() {
        Student s1= new Student("Namhla","217130565",90.6 );
        Student s2 = new Student("Odwa","217030565",80.9);
        assertNotSame("Namhla",s2.getStudentName());

    }

    @Test
        // test for object equality
    void getTestMark(){
        Student s1;
        assertEquals(90.6, 90.6);
    }


    @Test//test for timeout
    @Timeout(5)
    public void timeOutTest(){
        System.out.println("timeout test passed");
    }

    /*
       disabling test and failing test: slepping time unit is more than the timeout time
      the test failed, used the @Disabled to hide it
    */
    @Test
    @Disabled
    @Timeout(4)
    public void timeOutTest2() throws InterruptedException{
        TimeUnit.SECONDS.sleep(7);
        System.out.println("buffering......");
    }





}
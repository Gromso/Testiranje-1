package main;

import junit.framework.AssertionFailedError;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematickeOperacijeTest {


    private MatematickeOperacije matematickeOperacije = new MatematickeOperacije() ;


    @Test
    void testSaberi(){
        int prvi = 1;
        int drugi = 3;
        int expResult = 4;
        int result = matematickeOperacije.saberi(prvi, drugi);
        assertEquals(expResult, result);

    }

    @Test
    void testOduzmi(){
        int prvi = 3;
        int drugi = 1;
        int expResult = 2;
        int result = matematickeOperacije.oduzmi(prvi, drugi);
        assertEquals(expResult, result);

    }

    @Disabled("Nije jos uvek implementirano")
    void testPomnozi(){
        int prvi = 2;
        int drugi = 2;
        int expResult = 4;
        int result = matematickeOperacije.pomnozi(prvi, drugi);
        assertEquals(expResult, result);

    }
    @Test
    void testPodeli(){
        int prvi = 6;
        int drugi = 3;
        int expResult = 2;
        int result = matematickeOperacije.podeli(prvi, drugi);
        assertEquals(expResult, result);

    }
    /*@Test
    void testPodeliSaNullom(){

        Exception exception = assertThrows(NumberFormatException.class,() -> {

        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }*/





}
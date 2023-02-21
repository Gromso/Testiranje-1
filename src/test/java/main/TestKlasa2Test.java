package main;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestKlasa2Test {


    @BeforeClass
    public static void setUpClass(){
        System.out.println("Izvrsavanje BeforeClass Metode");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("Izvrsavanje AfterClass Metode");

    }

    @BeforeEach
    void setUp(){
        System.out.println("Izvrsavanje BeforeEach Metode");

    }
    @AfterEach
    void termDown(){
        System.out.println("Izvrsavanje AfterEach Metode");

    }

    @Test
    void testMetoda1(){
        System.out.println("Test1");
    }

    @Test
    void testMetoda2(){
        System.out.println("Test2");
    }

    @Test
    void testMetoda3(){
        System.out.println("Test3");
    }

    @Test
    void testMetoda4(){
        System.out.println("Test4");
    }

}
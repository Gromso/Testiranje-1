package main;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTestTest {

    List<String> testList;

    @BeforeEach
    public void initialize(){
       testList = new ArrayList<>();
        System.out.println(testList);
    }

    @Test
    void testList1(){
        assertEquals(testList.isEmpty(), true);
    }

    @Test
    void testList2 (){
        testList.add("testiranje softvera");
        assertEquals(1, testList.size());
    }



    @DisplayName("Test MessageServiceTest.get()")
    @Test
    void get() {
        assertEquals("Hello World",MessageServiceTest.get());
    }
}
package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.*;

class TestKlasaTest {

    OutputStream stream;
    @BeforeEach
    void setUp() throws FileNotFoundException {

        stream = new FileOutputStream("TestKlasa");
    }

    @Test
    void testMetoda(){
        // Koristimi OutputStream za izvrsavanje testova
    }

    @AfterEach
    void tearDown() {

        try {
            if (stream !=null) stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package day01;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameValidTest {
    NameValidator nV = new NameValidator();

    @Test
    void isNameValidTest(){
    boolean result = nV.isNameValid("John Doe");
    assertTrue(result);
    }

    @Test
    void isNameValidNullTest(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> nV.isNameValid(null));
        assertEquals("Invalid name",iae.getMessage());
    }
    @Test
    void isNameInValidTest(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> nV.isNameValid("John"));
        assertEquals("Invalid name",iae.getMessage());
    }

}

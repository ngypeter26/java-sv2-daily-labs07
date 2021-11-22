package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YearValidTest {
    YearOfBirthValidator yV = new YearOfBirthValidator();

    @Test
    void isYearValidTest(){
        boolean result = yV.isYearOfBirthValid(1901);
        assertTrue(result);
    }

    @Test
    void isYearInValidTest(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> yV.isYearOfBirthValid(1900));
        assertEquals("Invalid year",iae.getMessage());
    }


}

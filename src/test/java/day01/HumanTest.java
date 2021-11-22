package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class HumanTest {

    @Test
    void testHumanYearException(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> {
                    Human human = new Human("valami valami",1900);
                });
        assertEquals("You are too old!",e.getMessage());
    }

    @Test
    void testHumanNameException(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> {
                    Human human = new Human("valamivalami",1950);
                });
        assertEquals("Invalid name!",e.getMessage());
    }
    @Test
    void testHumanNameAndYearException(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> {
                    Human human = new Human(" valamivalami ",1900);
                });
        assertEquals("Invalid name!",e.getMessage());
    }

}

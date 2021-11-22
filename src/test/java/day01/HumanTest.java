package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HumanTest {
    @Test
    void createHumanWithError(){
        assertThrows(IllegalArgumentException.class,
                ()-> new HUmanNew("valami",1950));
    }
}

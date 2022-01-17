package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testCourierFileManager {


    @Test
    void testWrongFile(){
        Path path = Paths.get("src/main/resources/courier1.txt");

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> new CourierFileManager().createCourierByFile(path));

        assertEquals("Cannot read file!",ise.getMessage());
    }
    @Test
    void testRightFile(){
        Path path = Paths.get("src/main/resources/courier.txt");

        Courier courier =  new CourierFileManager().createCourierByFile(path);

        assertEquals(10,courier.getRides().get(2).getKm());
    }
}

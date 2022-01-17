package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testMovies {


    @Test
    void wrongFileName(){
        Path source = Paths.get("src/main/resources/movies1.csv");
//        MovieService ms = new MovieService(source);

        IllegalStateException e = assertThrows(IllegalStateException.class,
                ()-> new MovieService(source));

        assertEquals("Cannot read file!",e.getMessage());
    }
    @Test
    void rightFileName(){
        Path source = Paths.get("src/main/resources/movies.csv");
        MovieService ms = new MovieService(source);

        assertEquals("Star Wars",ms.getMovies().get(2).getTitle());
        assertEquals("Peter Jackson",ms.getMovies().get(3).getDirector());
        assertEquals(1975,ms.getMovies().get(4).getYear());
    }
}

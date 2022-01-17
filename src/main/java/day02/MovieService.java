package day02;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    private List<Movie> movies;

    public MovieService(Path path) {
        this.movies = fileReader(path);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    private List<Movie> fileReader(Path path){
        List<Movie> result = new ArrayList<>();

        try(Scanner scanner = new Scanner(path) ){
            while (scanner.hasNext()){

                result.add(parseLine(scanner.nextLine()));
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!");
        }
        return result;
    }

    private Movie parseLine(String line){
        String[] stringArr = line.split(";");
        return new Movie(stringArr[0],Integer.parseInt(stringArr[1]),stringArr[2]);
    }
}

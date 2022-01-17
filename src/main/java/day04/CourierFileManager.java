package day04;

import day02.Movie;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourierFileManager {

    public Courier createCourierByFile(Path path){
        Courier courier = new Courier();

        try(Scanner scanner = new Scanner(path) ){
            while (scanner.hasNext()){
                courier.addRide(parseLine(scanner.nextLine()));
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!");
        }
        return courier;
    }


    private Ride parseLine(String line){
        String[] stringArr = line.split(" ");
        return new Ride(Integer.parseInt(stringArr[0]),Integer.parseInt(stringArr[1]),Integer.parseInt(stringArr[2]));
    }
}

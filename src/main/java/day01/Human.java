package day01;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        String nameNew = name.trim();
        if (name.trim().contains(" ")) {
            this.name = name;
        }else{
            throw new IllegalArgumentException("Invalid name!");
        }

        if ((2021-yearOfBirth)>120){
            throw new IllegalArgumentException("You are too old!");
        }else {
            this.yearOfBirth = yearOfBirth;
        }
    }
}

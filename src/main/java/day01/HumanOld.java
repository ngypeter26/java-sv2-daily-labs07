package day01;

import java.time.LocalDate;

public class HumanOld {
    private String name;
    private int yearOfBirth;

    public HumanOld(String name, int yearOfBirth) {
        String nameNew = name.trim();
        if (name.trim().contains(" ") && name != null) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name!");
        }
        // LocalDate.now()
//        if ((2021-yearOfBirth)>120){
        if ((LocalDate.now().getYear() - yearOfBirth) > 120) {
            throw new IllegalArgumentException("You are too old!");
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        // Kristóg megoldás1
//        if ((LocalDate.now().getYear()-yearOfBirth)>120 && name.trim().contains(" ") && name!=null) {
//            this.name = name;
//            this.yearOfBirth = yearOfBirth;
//        }else{
//            throw new IllegalArgumentException("Invalid parameters!");
//        }
//
//        if ((LocalDate.now().getYear()-yearOfBirth)>120){
//            throw new IllegalArgumentException("You are too old!");
//        }else {
//
//        }
        // Kristóg megoldás2
        if (isYearOfBirthValid(yearOfBirth) && isNameValid(name)){
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }

    private boolean isYearOfBirthValid(int yearOfBirth) {
        if ((LocalDate.now().getYear() - yearOfBirth) > 120) {
            throw new IllegalArgumentException("Invalid year");
        }
        return true;
    }
    private boolean isNameValid(String name) {
        if (name!=null && name.indexOf(" ")>0) {
            throw new IllegalArgumentException("Invalid name");
        }
        return true;
    }

}

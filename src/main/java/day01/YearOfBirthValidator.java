package day01;

import java.time.LocalDate;

public class YearOfBirthValidator {
    public boolean isYearOfBirthValid(int yearOfBirth) {
        if ((LocalDate.now().getYear() - yearOfBirth) > 120) {
            throw new IllegalArgumentException("Invalid year");
        }
        return true;
    }
}

package day01;

public class HUmanNew {
    private String name;
    private int yearOfBirth;

    public HUmanNew(String name, int yearOfBirth) {
        NameValidator nV = new NameValidator();
        YearOfBirthValidator yOBV = new YearOfBirthValidator();

        if (nV.isNameValid(name) && yOBV.isYearOfBirthValid(yearOfBirth))
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


}

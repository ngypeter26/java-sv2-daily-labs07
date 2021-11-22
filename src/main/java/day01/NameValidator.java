package day01;

public class NameValidator {
    public boolean isNameValid(String name) {
        if (name!=null && name.indexOf(" ")>0) {
            return true;
        }else{
            throw new IllegalArgumentException("Invalid name");
        }
    }
}

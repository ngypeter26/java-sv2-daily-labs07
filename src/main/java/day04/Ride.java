package day04;

public class Ride {
    private int day;
    private int numberOfRide;
    private int km;

    public Ride(int day, int numberOfRide, int km) {
        this.day = day;
        this.numberOfRide = numberOfRide;
        this.km = km;
    }

    public int getDay() {
        return day;
    }

    public int getNumberOfRide() {
        return numberOfRide;
    }

    public int getKm() {
        return km;
    }
}

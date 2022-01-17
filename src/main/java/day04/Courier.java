package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride){
        if (!isNext(ride)){
            throw new IllegalArgumentException("This is not the next!");
        }
        rides.add(ride);
    }


    private boolean isNext(Ride ride){
            if (rides.size()==0){
                return ride.getNumberOfRide()==1;
            }
            Ride lastRide = rides.get(rides.size()-1);
            if (lastRide.getDay()==ride.getDay()){
                return ride.getNumberOfRide() == lastRide.getNumberOfRide()+1;
            }
            if (lastRide.getDay()>ride.getDay()){
                return false;
            }
            return ride.getNumberOfRide() ==1;
    }

    public List<Ride> getRides() {
        return rides;
    }
}

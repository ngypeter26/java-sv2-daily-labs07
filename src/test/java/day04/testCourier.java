package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testCourier {
    Courier courier = new Courier();
    Ride ride1 = new Ride(1, 1, 10);
    Ride ride2 = new Ride(1, 2, 10);
    Ride ride3 = new Ride(1, 3, 10);
    Ride ride4 = new Ride(2, 1, 10);
    Ride ride5 = new Ride(2, 2, 10);
    Ride ride6 = new Ride(5, 1, 10);
    Ride ride7 = new Ride(5, 2, 10);
    Ride ride8 = new Ride(5, 3, 10);

    @Test
    void testGoodOrder(){
       courier.addRide(ride1);
       courier.addRide(ride2);
       courier.addRide(ride3);
       courier.addRide(ride4);
       courier.addRide(ride5);
       courier.addRide(ride6);
       courier.addRide(ride7);
       courier.addRide(ride8);
       assertEquals(8,courier.getRides().size());
    }
    void testGoodOrder2(){
        courier.addRide(ride4);
        courier.addRide(ride5);
        courier.addRide(ride6);
        courier.addRide(ride7);
        assertEquals(4,courier.getRides().size());
    }
    @Test
    void testWrongOrderNewDay(){
        courier.addRide(ride1);
        courier.addRide(ride2);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> courier.addRide(ride5));
        assertEquals("This is not the next!",iae.getMessage());
    }
    @Test
    void testWrongOrderSameDay(){
        courier.addRide(ride1);
        courier.addRide(ride2);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> courier.addRide(ride1));
        assertEquals("This is not the next!",iae.getMessage());
    }
    @Test
    void testWrongInitDay(){

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> courier.addRide(ride2));
        assertEquals("This is not the next!",iae.getMessage());
    }
}

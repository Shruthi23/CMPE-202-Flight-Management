package test;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FlightListTest extends TestCase {
    @Test
    public void ShouldReturnSameObjectsForFlights() {

        Flights f1 = new Flights("Economy", "SJ123", 22, 100, "San Jose", "Phoenix");
        Flights f2 = new Flights("Business", "SJ178", 30, 140, "SFO", "ORD");


        ArrayList<Flights> flights = new ArrayList<>();
        flights.add(f1);

        FlightList.getInstance().addToList(f1);
        FlightList.getInstance().addToList(f2);
      ArrayList<Flights> fl1=  FlightList.getInstance().getList();
      ArrayList<Flights> fl2=FlightList.getInstance().getList();
      assertEquals(fl1,fl2);

        // FlightList.


    }
}
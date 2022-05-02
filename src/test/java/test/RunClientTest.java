package test;

import junit.framework.TestCase;
import org.junit.Test;
import test.output.CSVFileOutput;
import test.output.FileType;
import test.output.OutputFactory;
import test.output.TextFileOutput;

import java.util.ArrayList;

public class RunClientTest extends TestCase {
    @Test
    public void testFactory(){


            Output output=new Output("Sam","SJ456","Economy",22, 100);
       OutputFactory outputFactory=new OutputFactory();
      FileType csv=  outputFactory.getType(output,"Sam","success");
        assertTrue(csv instanceof CSVFileOutput);
        assertFalse(csv instanceof TextFileOutput);
            //assertTrue(true);


    }


        @Test
        public void testSingleTon() {
       // assertTrue(true);

            Flights f1 = new Flights("Economy", "SJ123", 22, 100, "San Jose", "Phoenix");
            Flights f2 = new Flights("Business", "SJ178", 30, 140, "SFO", "ORD");
BookingDetails b1=new BookingDetails("john","dnjdn","mkjk",88,"db2uu2");

            ArrayList<Flights> flights = new ArrayList<>();
            flights.add(f1);

            FlightList.getInstance().addToList(f1);
            FlightList.getInstance().addToList(f2);
            ArrayList<Flights> fl1=  FlightList.getInstance().getList();
            ArrayList<Flights> fl2=FlightList.getInstance().getList();
            assertEquals(fl1,fl2);
            //asse

            // FlightList.


        }



}
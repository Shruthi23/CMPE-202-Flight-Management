package test;
import junit.framework.TestCase;
import org.junit.Test;
import test.output.CSVFileOutput;
import test.output.FileType;
import test.output.OutputFactory;
import test.output.TextFileOutput;
import test.validation.Chain;

import java.util.ArrayList;

public class SingletonClassTest extends  TestCase {
    public void testSingleTonBookingList() {
        // assertTrue(true);


        BookingDetails b1=new BookingDetails("john","dnjdn","mkjk",88,"4077273839272555");
        BookingDetails b2=new BookingDetails("Sierra","SJC123","Economy",100,"6011283930384833");

        ArrayList<BookingDetails> bookingDetails = new ArrayList<>();
        SingletonBookingList.getInstance().addToList(b1);
        SingletonBookingList.getInstance().addToList(b2);


        ArrayList<BookingDetails> bl1=  SingletonBookingList.getInstance().getList();
        ArrayList<BookingDetails> bl2=SingletonBookingList.getInstance().getList();
        assertEquals(bl1,bl2);
        //assertEquals(b1,b2);
        //asse

        // FlightList.


    }

    public void testSingleTonFlights() {
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



    }
}

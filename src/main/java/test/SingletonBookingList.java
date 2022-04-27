package test;

import test.validation.Chain;
import test.validation.FlightNumValidator;

import java.util.ArrayList;
import java.util.List;

public class SingletonBookingList {
    private static List<BookingDetails> bookingList=null;
    private static SingletonBookingList mInstance;
    private SingletonBookingList(){
        bookingList=new ArrayList<>();
    }
    public static SingletonBookingList getInstance() {
        if(mInstance == null)
            mInstance = new SingletonBookingList();

        return mInstance;
    }

    public void addToList(BookingDetails b){
        bookingList.add(b);

    }
    public void createBooking(String[] meta) {
        String name = meta[0];
        String flightNo = meta[1];
        String category = meta[2];
        int seats = Integer.parseInt(meta[3]);
        String card = meta[4];
        ArrayList<Flights> fl = FlightList.getInstance().getList();
        FlightNumValidator flightNumValidator = new FlightNumValidator();
        BookingDetails b = new BookingDetails(name, flightNo, category, seats, card);
        if (flightNumValidator.validateFlight(b)) {
            Chain chain = new Chain();
            chain.validate(card);
            String res = chain.getRes();
            if (!res.equals("Invalid card")) {
                //BookingDetails b=new BookingDetails(name,flightNo,category,seats,card);
                addToList(b);
            }
        }
    }



//
//     }






    public ArrayList<BookingDetails> getList(){
        return (ArrayList<BookingDetails>) bookingList;
    }
}

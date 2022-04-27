package test.validation;

//package test.validation;

import test.BookingDetails;
import test.FlightList;
import test.Flights;

import java.util.ArrayList;

public class FlightSeatValidator extends FlightValidator {
    public FlightSeatValidator(FlightValidator flightValidator) {
        //super(fli);
        super(flightValidator);
    }
    public void validateFlight(BookingDetails b){
        ArrayList<Flights> data= FlightList.getInstance().getList();
        boolean[] flag={false};
        data.forEach(ele->{
            if(ele.getFlightNum().equals(b.getFlightNum()) ){
                flag[0]=true;

            }


        });
        if(!flag[0]){
            System.out.println("Invalid flight number");;

        }
         super.validateFlight(b);
    }

}


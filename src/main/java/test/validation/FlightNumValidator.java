package test.validation;

import test.BookingDetails;
import test.FlightList;
import test.Flights;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FlightNumValidator   {
    public FlightNumValidator() {
        //super(fli);
         //super(flightValidator);
    }
    public boolean validateFlight(BookingDetails b){
        boolean[] flag={false};
    ArrayList<Flights> data= FlightList.getInstance().getList();
   String res="";
   // boolean[] flag={false};
   data.forEach(ele->{
       if(ele.getFlightNum().equals(b.getFlightNum()) & ele.getCategory().equals(b.getCategory()) & ele.getNoOfSeats()>=b.getNoOfSeats())
       {
           flag[0]=true;


       }

   });
   return flag[0];

     // System.out.println("contains   "+ data.contains(b.getFlightNum()));
//

    }
    public boolean validateSeats(BookingDetails b,Flights f){

        if(f.getNoOfSeats()>=b.getNoOfSeats()){
           return validatecategory(b,f);


        }
        else{
            System.out.println("invalid seats    "+ b.getName());
            return false;

        }

    }
    public boolean validatecategory(BookingDetails b,Flights f){
        if(f.getCategory().equals(b.getCategory())){
            return true;

        }
        else{
            System.out.println("invalid category    "+ b.getName());
            return false;
        }
    }

}

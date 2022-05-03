package test.validation;

import test.BookingDetails;
import test.FlightList;
import test.Flights;
import test.output.OutFactoryPatternDemo;

import java.io.IOException;
import java.util.ArrayList;

public class FlightNumValidator   {
    public FlightNumValidator() {
        //super(fli);
         //super(flightValidator);
    }
//    public boolean validateFlight(BookingDetails b){
//        boolean[] flag={false};
//    ArrayList<Flights> data= FlightList.getInstance().getList();
//   String res="";
//   // boolean[] flag={false};
//   data.forEach(ele->{
//       if(ele.getFlightNum().equals(b.getFlightNum()) & ele.getCategory().equals(b.getCategory()) & ele.getNoOfSeats()>=b.getNoOfSeats())
//       {
//           flag[0]=true;
//
//
//       }
//
//   });
//   return flag[0];
//
//     // System.out.println("contains   "+ data.contains(b.getFlightNum()));
////
//
//    }
    public boolean validateSeats(BookingDetails b,Flights f){
        if(b.getNoOfSeats()<=f.getNoOfSeats()){
            return true;
        }
        else{
            return false;
        }



    }
    public boolean validatecategory(BookingDetails b,ArrayList<Flights> filteredFlights){
        boolean[] flag={false};
//        if(f.getCategory().equals(b.getCategory())){
//            return true;
//
//        }
//        else{
//            System.out.println("invalid category    "+ b.getName());
//            return false;
//        }
        filteredFlights.forEach(ele->{
            if(ele.getCategory().equals(b.getCategory())){
             flag[0] = validateSeats(b,ele);

            }
        });
        return flag[0];
    }
    public boolean validateFlight(BookingDetails b) throws IOException {

        ArrayList<Flights> fl=FlightList.getInstance().getList();
        ArrayList<Flights> filteredFlights=new ArrayList<>();
        boolean[] flag={false};
     fl.forEach(ele->{
         if(ele.getFlightNum().equals(b.getFlightNum())){
             filteredFlights.add(ele);
             flag[0]=true;
         }
     });
     if(!flag[0]){
         //File obj=new File("output.txt");
        // OutputFile.createFile(b.getName(),"Invalid flight number");
        // OutputFactory outputFactory=new OutputFactory();
         OutFactoryPatternDemo outFactoryPatternDemo=new OutFactoryPatternDemo(null,b.getName(),"Invalid flight number");
         //outputFactory.create(null,b.getName(),"Invalid flight number");
         outFactoryPatternDemo.createType();

         System.out.println("No flight number");
     }
     else{
         flag[0]=validatecategory( b,filteredFlights);

     }
     return flag[0];
    }

}

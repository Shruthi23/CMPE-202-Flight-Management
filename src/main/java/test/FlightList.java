package test;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

   private static List<Flights> flightInfo=null;
   private static FlightList mInstance;
    private FlightList(){
        flightInfo=new ArrayList<>();


    }

    public static FlightList getInstance() {
        if(mInstance == null)
            mInstance = new FlightList();

        return mInstance;
    }
    public ArrayList<Flights> getList(){
        return (ArrayList<Flights>) flightInfo;
    }
    public void addToList(Flights f){
        flightInfo.add(f);

    }
    public void createFlights(String[] meta){
        String category=meta[0];

        String flightNo=meta[1];
        int seats=Integer.parseInt(meta[2]);
        int price=Integer.parseInt(meta[3]);
        String src=meta[4];
        String dest=meta[5];

        Flights f=new Flights(category,flightNo,seats,price,src,dest);
        addToList(f);


        //return(new Flights(category,flightNo,seats,price,src,dest));

    }


}

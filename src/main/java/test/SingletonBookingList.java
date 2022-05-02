package test;

import test.output.OutputFactory;
import test.validation.CardValidator;
import test.validation.Chain;
import test.validation.FlightNumValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

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
    public void createBooking(String[] meta) throws IOException {
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
            OutputFactory outputFactory=new OutputFactory();

            if (!res.equals("Invalid card")) {
                System.out.println("validate loop"+b.getName());
               AtomicReference<Integer> cost = new AtomicReference<>();
                //BookingDetails b=new BookingDetails(name,flightNo,category,seats,card);
                fl.forEach(ele->{
                    if(ele.getFlightNum().equals(b.getFlightNum()) && ele.getCategory().equals(b.getCategory())){
                        cost.set(ele.getPrice() * b.getNoOfSeats());
                        ele.setSeats(b.getNoOfSeats());


                    }
                });
                Output output=new Output(name,flightNo,category,seats, cost.get());
                output.addList(output);
                System.out.println("call outpu; factory"+b.getName());

                outputFactory.create(output,b.getName(),"success");


                addToList(b);

                //output.
             ArrayList<Output>arr=   Output.getList();
             System.out.println("arr    "+arr.size());
            }
            else{
                System.out.println("else");
                outputFactory.create(null,b.getName(),"Invalid card number");

               // OutputFile.createFile(b.getName(),"Invalid card number",null);
            }
        }
    }




//
//     }






    public ArrayList<BookingDetails> getList(){
        return (ArrayList<BookingDetails>) bookingList;
    }
}

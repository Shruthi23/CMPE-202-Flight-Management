package test;

import test.validation.Chain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.concurrent.atomic.AtomicBoolean;

public class RunClient {
    String line="";
    static List<BookingDetails> details=new ArrayList<>();
    static List<Flights> flightInfo=new ArrayList<>();
    static HashMap<String,Object> flight=new HashMap<>();


    public static  void main(String[] args) throws FileNotFoundException {

        RunClient runClient=new RunClient();
    runClient.insertFlightData();
//        System.out.println(flightInfo.size());
//        runClient.insertBookingData();
//        details.forEach(ele->{
//            System.out.println("ele"+ele.getCardNo());
//        });
//        Chain chain=new Chain();
//        chain.validate("52983737373262");
        //System.out.println("flight"+flight.get("BY110"));
        flight.entrySet().forEach(entry->{

           // f.getCategory()
            System.out.println(entry.getKey() + " " + entry.getValue());
        });





    }

    private static BookingDetails createBooking(String[] meta){
        String name=meta[0];
        String flightNo=meta[1];
        String category=meta[2];
        int seats=Integer.parseInt(meta[3]);
        String card=meta[4];
        return(new BookingDetails(name,flightNo,category,seats,card));
    }
    private static Flights createFlights(String[] meta){
        String category=meta[0];

        String flightNo=meta[1];
        int seats=Integer.parseInt(meta[2]);
        int price=Integer.parseInt(meta[3]);
        String src=meta[4];
        String dest=meta[5];


        //int seats=Integer.parseInt(meta[3]);
        //String card=meta[4];
        return(new Flights(category,flightNo,seats,price,src,dest));
    }
    public void insertFlightData(){
        String pathflights="/Users/shruthi/Downloads/flights.csv";

        try{
            BufferedReader br=new BufferedReader(new FileReader(pathflights));
            String line=br.readLine();
            while((line=br.readLine())!=null) {
               // System.out.println(line);
                String[] attr = line.split(",");
                Flights flights = createFlights(attr);
                //flightInfo.add(flights);
                System.out.println(flights.getCategory());
                if(flight.containsKey(attr[1])){
                    Flights f= (Flights) flight.get(attr[1]);
                    System.out.println("flight name"+f.getCategory());

//                    System.out.println("flight");
//
//                    ArrayList<Flights> arr= new ArrayList<>();
//                    arr.add(f);
//                    arr.add(flights);
//                    flight.put(attr[1],arr);
//                    System.out.println("if   "+flight.get(attr[1]));

                }
                else {
                    flight.put(attr[1], flights);
                }
                //System.out.println(flightInfo.get(0));

            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void insertBookingData(){
        String path="/Users/shruthi/Downloads/Sample.csv";
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line=br.readLine();
            while((line=br.readLine())!=null) {

                String[] attr = line.split(",");

                if(flight.containsKey(attr[1])){
                    Flights f= (Flights) flight.get(attr[1]);
                }
//                //AtomicBoolean flag=isFlightNumberValid(attr[1]);
//                System.out.println("attr2"+attr[3]);
//
//                if(isFlightNumberValid(attr[0], attr[1],Integer.parseInt(attr[3]),attr[2])){
//                    BookingDetails bookingDetails = createBooking(attr);
//
//                    details.add(bookingDetails);
//                }
//                else{
//                    System.out.println("false");
//                }




            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean isFlightNumberValid(String name,String flightNum,int seats,String category){
        final boolean[] flag = {false};
        flightInfo.forEach(ele->{
            //System.out.println("ele.getFile"+ele.getFlightNum()+ " "+flightNum + ele.getCategory() +" "+category+" "+name);
            System.out.println("ele.catrgory"+ ele.getCategory()+" "+" "+category);
            if(ele.getFlightNum().equals(flightNum) && ele.getCategory().equals(category) && ele.getNoOfSeats() >=seats ){
                flag[0]=true;
//                if(ele.getNoOfSeats() >= seats){
//                    if(ele.getCategory().equals(category)){
//                        flag[0] =true;
//                    }
                }





        });
        return flag[0];
    }

}


class BookingDetails{
    private String name;
    private String flightNum;
    private int noOfSeats;
    private String category;
    private String cardNo;
    public BookingDetails(String name,String flightNo,String category,int seats,String cardNo ){
        this.name=name;
        this.flightNum=flightNo;
        this.noOfSeats=seats;
        this.category=category;
        this.cardNo=cardNo;
    }
    public String getName(){
        return name;
    }
    public String getFlightNum(){
        return flightNum;
    }
    public String getCategory(){
        return category;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public String getCardNo(){
        return cardNo;
    }
}

class Flights{
    private String category;
    private String flightNum;
    private int noOfSeats;
    private int price;
    private String src;
    private  String dest;
    private String cardNo;
    public Flights(String  category,String flightNo,int seats,int price,String src,String dest ){
        this.category=category;
        this.flightNum=flightNo;
        this.noOfSeats=seats;
        this.price=price;
        this.src=src;
        this.dest=dest;
    }
    public String getSrc(){
        return src;
    }
    public String getFlightNum(){
        return flightNum;
    }
    public String getCategory(){
        return category;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public String getDest(){
        return dest;
    }
    public int getPrice(){
        return price;
    }
}


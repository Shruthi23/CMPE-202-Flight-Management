package test;

import test.validation.Chain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.security.KeyPair;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.io.File;


import java.util.concurrent.atomic.AtomicBoolean;

public class RunClient {
    String line="";
    static List<BookingDetails> details=new ArrayList<>();
    //public static String[] savedArgs= new String[4];
    public static ArrayList<String> savedArgs=new ArrayList<>();




    public static  void main(String[] args) throws FileNotFoundException {
        System.out.println("main function");

        RunClient runClient=new RunClient();
        //Scanner path1 = new Scanner(args[1]);
//        Scanner path2 = new Scanner(args[0]);
//
//        System.out.println("args--->"+args[0]+ " " +args.length);
         //runClient.insertFlightData(args[1]);

        runClient.insertFlightData("njjkh");


//        for (int i = 0; i < args.length; i++) {
//            System.out.println("System inside for"+args[i]);
//            String a=args[i];
//
//            savedArgs.add(a);
//            System.out.println("increment   "+savedArgs.size());
//
//        }
        runClient.insertBookingDetails("njkhkj");




         ArrayList<Flights> data=  FlightList.getInstance().getList();


         ArrayList<BookingDetails> bookingDetails=SingletonBookingList.getInstance().getList();
         data.forEach(ele->{
          System.out.println("ele flight   "+ele.getFlightNum());
      });
         bookingDetails.forEach(ele->{
             System.out.println("ele booking    "+ele.getName());
         });
    }
    public static ArrayList<String> getArgs(){
        System.out.println("savedargs   "+savedArgs.size());
        return  savedArgs;
    }




    private static Flights createFlights(String[] meta){
        String category=meta[0];

        String flightNo=meta[1];
        int seats=Integer.parseInt(meta[2]);
        int price=Integer.parseInt(meta[3]);
        String src=meta[4];
        String dest=meta[5];



        return(new Flights(category,flightNo,seats,price,src,dest));
    }
    public void insertFlightData(String path){
       // System.out.println("path-->"+path);

        String pathflights="/Users/shruthi/Downloads/flights.csv";

        try{
            BufferedReader br=new BufferedReader(new FileReader(pathflights));
            String line=br.readLine();
            while((line=br.readLine())!=null) {

                String[] attr = line.split(",");

               FlightList.getInstance().createFlights(attr);

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void insertBookingDetails(String p){
        String path="/Users/shruthi/Downloads/Sample.csv";
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line=br.readLine();
            while((line=br.readLine())!=null) {

                String[] attr = line.split(",");
                SingletonBookingList.getInstance().createBooking(attr);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}



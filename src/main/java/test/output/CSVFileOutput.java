package test.output;

import test.Output;
import com.opencsv.CSVWriter;
import test.RunClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVFileOutput  implements FileType {

    //String[] args= RunClient.getArgs();

   // String p=args[2];
   ArrayList<String> saved=RunClient.getArgs();

   // System.out.println("CSV FILE");

    String p=saved.get(2);
    

    public void createOutput(Output o,String name,String reason) {
        System.out.println("CSV FILE");


        //CSVWriter csvWriter=new CSVWriter(new FileWriter("output.csv"));
        File file = new File(p);

        if (file.exists()) {
            System.out.println("do nothing");


            CSVWriter writer = null;
            try {
                writer = new CSVWriter(new FileWriter(p, true));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //String [] record = "4,David,Miller,Australia,30".split(",");


            //writer.writeNext(record);
            writer.writeNext(new String[]{o.getName(), o.getFlightNum(), o.getCategory(), String.valueOf(o.getNoOfSeats()), String.valueOf(o.getCost())});
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            CSVWriter writer = null;
            try {
                writer = new CSVWriter(new FileWriter(p));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("CSV file" + o.getName());
            String [] record = "Booking name,Flight Number,Category,No of seats,Price".split(",");
            writer.writeNext(record);

            //writer.writeNext("Booking name","flight number","category","no of seats","price");
            writer.writeNext(new String[]{o.getName(), o.getFlightNum(), o.getCategory(), String.valueOf(o.getNoOfSeats()), String.valueOf(o.getCost())});

            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //writer.writeNext(new String[]{o.getName(), o.getFlightNum(), o.getCategory(), String.valueOf(o.getNoOfSeats()), String.valueOf(o.getCost())});
            //CSVWriter

        }
   }

}

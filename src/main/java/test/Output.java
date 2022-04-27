//package test;
//
//public class BookingDetails {
//    private String name;
//    private String flightNum;
//    private int noOfSeats;
//    private String category;
//    private String cardNo;
//
//    public BookingDetails(String name, String flightNo, String category, int seats, String cardNo) {
//        this.name = name;
//        this.flightNum = flightNo;
//        this.noOfSeats = seats;
//        this.category = category;
//        this.cardNo = cardNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getFlightNum() {
//        return flightNum;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public int getNoOfSeats() {
//        return noOfSeats;
//    }
//
//    public String getCardNo() {
//        return cardNo;
//    }
//}
package test;

import java.util.ArrayList;

public class Output {
    private String name;
    private String flightNum;
    private int noOfSeats;
    private String category;
    private Integer cost;
    private static ArrayList<Output> outputs=new ArrayList<>();

    public Output(String name, String flightNo, String category, int seats, Integer cost) {
        this.name = name;
        this.flightNum = flightNo;
        this.noOfSeats = seats;
        this.category = category;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getCategory() {
        return category;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public Integer getCost() {
        return cost;
    }
    public void addList(Output o){
        outputs.add(o);

    }
    public static ArrayList<Output> getList(){
        return outputs;
    }
}

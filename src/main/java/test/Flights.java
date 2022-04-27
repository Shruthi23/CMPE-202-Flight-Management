package test;

public class Flights {
    private String category;
    private String flightNum;
    private int noOfSeats;
    private int price;
    private String src;
    private String dest;
    private String cardNo;

    public Flights(String category, String flightNo, int seats, int price, String src, String dest) {
        this.category = category;
        this.flightNum = flightNo;
        this.noOfSeats = seats;
        this.price = price;
        this.src = src;
        this.dest = dest;
    }

    public String getSrc() {
        return src;
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

    public String getDest() {
        return dest;
    }

    public int getPrice() {
        return price;
    }
}

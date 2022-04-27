package test.validation;

import test.BookingDetails;

public class Chain {
    CardValidator chain;
    FlightValidator chain1;
    public Chain(){
        buildChain();

    }
    public void buildChain(){
        chain=new MasterCardValidator(new VisaCardValidator(new AmexCardValidator(new DiscoveryCardValidator(null))));
    //chain1=new FlightNumValidator(new FlightSeatValidator(null));
    }
    public void validate(String cardNum){
        //System.out.println("chain-->"+chain);
        chain.validate(cardNum);
        //return flag;
    }
    public String getRes(){
      return chain.getRes();


    }
    public void validateFlight(BookingDetails b){
        chain1.validateFlight(b);
    }

}

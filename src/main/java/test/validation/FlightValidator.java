package test.validation;

import test.BookingDetails;

public abstract class FlightValidator {
    private FlightValidator flightValidator;
    public FlightValidator(FlightValidator flightValidator){
        this.flightValidator=flightValidator;
    }

    public void validateFlight(BookingDetails b){
        if(flightValidator!=null){
            flightValidator.validateFlight(b);

        }
        else{
            System.out.println("invalid flight");
        }
        //return true;

    }
}

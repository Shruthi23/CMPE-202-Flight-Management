package test.validation;

public class AmexCardValidator extends  CardValidator {
    public AmexCardValidator(CardValidator cardValidator){
        super(cardValidator);
    }
    public void validate(String cardNum){

        String sec= String.valueOf(cardNum.charAt(1));

        if(cardNum.length()==15 & cardNum.startsWith("3") & (sec.equals("3") || sec.equals("4"))){
            System.out.println("validate Discovery");
        }
        else{
            super.validate(cardNum);
        }

    }
}

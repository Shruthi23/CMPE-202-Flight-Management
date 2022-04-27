package test.validation;

public class VisaCardValidator extends  CardValidator{
    public VisaCardValidator(CardValidator cardValidator) {
        super(cardValidator);
    }
    public void validate(String cardNum){
        if(cardNum.startsWith("4") && (cardNum.length()==13 || cardNum.length()==16)){
            System.out.println("validate Visa");
            //return true;
        }
        else{
            System.out.println("super   "+super.getClass());
            super.validate(cardNum);
            //return false;
        }

    }
}

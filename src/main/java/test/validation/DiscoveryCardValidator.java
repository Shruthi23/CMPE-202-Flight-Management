package test.validation;

public class DiscoveryCardValidator extends  CardValidator
{
    public DiscoveryCardValidator(CardValidator cardValidator){
        super(cardValidator);
    }
    public void validate(String cardNum){
        if(cardNum.length()==16 & cardNum.startsWith("6011")){
            System.out.println("validate Discovery");
            //return true;
        }
        else{
            super.validate(cardNum);
            //return false;
        }

    }


}

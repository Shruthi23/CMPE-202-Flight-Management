package test.validation;

public abstract class CardValidator {
    private CardValidator cardValidator;
    private static String res="";
    public CardValidator(CardValidator cardValidator){
        this.cardValidator=cardValidator;
    }
    public void validate(String cardNum){
        if(cardValidator!=null){
            cardValidator.validate(cardNum);
            //return true;
        }
        else{
            System.out.println("Invalid card");
            res="Invalid card";
            System.out.println("res in else"+ " "+res);
           // return false;
        }
    }
    public String getRes(){
        System.out.println("res in getRes"+ " "+res);
        return res;
    }
}

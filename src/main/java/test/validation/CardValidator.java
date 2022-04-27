package test.validation;

import test.Output;
import test.OutputFile;

public abstract class CardValidator {
    private CardValidator cardValidator;
    private static String res="";
    public CardValidator(CardValidator cardValidator){
        this.cardValidator=cardValidator;
    }
    public void validate(String cardNum){
        System.out.println("cardvalidator   "+cardValidator);
        if(cardValidator!=null){
            cardValidator.validate(cardNum);
            //return true;
        }
        else{
            System.out.println("Invalid card");
            res="Invalid card";
            System.out.println("res in else"+ " "+res);
            //OutputFile.createFile();
           // return false;
        }
    }
    public String getRes(){
        System.out.println("res in getRes"+ " "+res);
        return res;
    }
}

package test.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MasterCardValidator extends CardValidator{
    public MasterCardValidator(CardValidator cardValidator) {
        super(cardValidator);
    }
    public void validate(String cardNum){
        String regexStr = "[0-9]+";
        String sec= String.valueOf(cardNum.charAt(1));
        Pattern pattern=Pattern.compile(regexStr);
        Matcher matcher=pattern.matcher(sec);
        boolean res=matcher.matches();
        System.out.println("res"+res);
        if(cardNum.startsWith("5") && cardNum.length()==16 && res ){
            System.out.println("validate master");
        }
        else{
            super.validate(cardNum);
        }

    }
}

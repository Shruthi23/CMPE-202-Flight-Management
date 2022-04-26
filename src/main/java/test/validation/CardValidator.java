package test.validation;

public abstract class CardValidator {
    private CardValidator cardValidator;
    public CardValidator(CardValidator cardValidator){
        this.cardValidator=cardValidator;
    }
    public void validate(String cardNum){
        if(cardValidator!=null){
            cardValidator.validate(cardNum);
        }
        else{
            System.out.println("Invalid card");
        }
    }
}

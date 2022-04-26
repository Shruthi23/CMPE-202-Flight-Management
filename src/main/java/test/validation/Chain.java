package test.validation;

public class Chain {
    CardValidator chain;
    public Chain(){
        buildChain();

    }
    public void buildChain(){
        chain=new MasterCardValidator(new VisaCardValidator(null));
    }
    public void validate(String cardNum){
        System.out.println("chain-->"+chain);
        chain.validate(cardNum);
    }

}

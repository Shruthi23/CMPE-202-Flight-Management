package test.output;

import test.Output;

public class OutFactoryPatternDemo {
    public  Output output;
    public  String name;
   public  String reason;
    public OutFactoryPatternDemo(Output output,String name,String reason){
        this.output=output;
        this.name=name;
        this.reason=reason;
    }

//    public static void main(String[] args) {
//        OutputFactory outputFactory=new OutputFactory();
//        FileType fileType=outputFactory.getType(this.output,this.name,reason);
//
//
//    }
    public void createType(){
        OutputFactory outputFactory=new OutputFactory();


        FileType fileType=outputFactory.getType(output,name,reason);
        System.out.println("filetype--->"+fileType);
        fileType.createOutput(output,name,reason);
    }
}

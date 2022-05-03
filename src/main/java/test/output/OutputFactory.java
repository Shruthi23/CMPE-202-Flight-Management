package test.output;

import test.Output;

import java.io.IOException;

public class OutputFactory {
   // OutputFile outputFile=new OutputFile();


//    static String type="";
//
//    public void create(Output output,String name, String res) throws IOException {
//        System.out.println("CSV factory"+name);
//        if(output==null){
//
//            TextFileOutput textFileOutput=new TextFileOutput();
//            textFileOutput.createOutput(null,name,res);
//          // OutputFactory outputFactory=new TextFileOutput();
//            OutputFactory.setInstance("TextFile");
//
//        }
//        else{
//            CSVFileOutput csvFileOutput=new CSVFileOutput();
//            try {
//                csvFileOutput.createOutput(output, name, res);
//                OutputFactory.setInstance("CSV file");
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
//
//        }
//
//
//    }
//    public static String getInstance(){
//        return type;
//    }
//    public static void setInstance(String objectType){
//        type=objectType;
//
//
//    }

public FileType getType( Output output,String name,String reason){
    if(output==null){
        return new TextFileOutput();
    }
    else{
        return new CSVFileOutput();
    }


}



}

package test.output;

import test.Output;

import java.io.IOException;

public class OutputFactory {
   // OutputFile outputFile=new OutputFile();
    public void create(Output output,String name, String res) throws IOException {
        System.out.println("CSV factory"+name);
        if(output==null){
            TextFileOutput textFileOutput=new TextFileOutput();
            textFileOutput.createOutput(null,name,res);
        }
        else{
            CSVFileOutput csvFileOutput=new CSVFileOutput();
            csvFileOutput.createOutput(output,name,res);
        }


    }

}

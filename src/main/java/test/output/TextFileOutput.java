package test.output;

import test.Output;
import test.RunClient;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class TextFileOutput implements  FileType {


    public void createOutput(Output o,String name,String reason) {
        ArrayList<String> saved= RunClient.getArgs();
  //System.out.println("args in file"+saved.get(2));
   String p=saved.get(3);
        File file=new File(p);
        Path path=Path.of(String.valueOf(file));
        final String NEW_LINE = System.lineSeparator();
        String content="Please enter correct booking details for  "+name +" "+":  "+reason+NEW_LINE;
        if(!file.exists()){
            try {
                Files.writeString(path,content);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        else{

            try {
                Files.write(path, content.getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}

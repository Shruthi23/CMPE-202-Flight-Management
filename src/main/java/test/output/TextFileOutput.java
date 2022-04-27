package test.output;

import test.Output;
import test.OutputFile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TextFileOutput extends OutputFile {
    public void createOutput(Output o,String name,String reason) throws IOException {
        File file=new File("output.text");
        Path path=Path.of(String.valueOf(file));
        final String NEW_LINE = System.lineSeparator();
        String content="Please enter correct booking details for  "+name +" "+":  "+reason+NEW_LINE;
        if(!file.exists()){
            Files.writeString(path,content);

        }
        else{

            Files.write(path, content.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);


        }
    }
}

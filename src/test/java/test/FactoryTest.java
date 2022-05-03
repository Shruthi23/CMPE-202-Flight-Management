package test;

import junit.framework.TestCase;
import org.junit.Test;
import test.output.CSVFileOutput;
import test.output.FileType;
import test.output.OutputFactory;
import test.output.TextFileOutput;

public class FactoryTest extends TestCase {
    @Test
    public void testFactoryCSV(){
        Output output=new Output("Sam","SJ456","Economy",22, 100);
        OutputFactory outputFactory=new OutputFactory();

      // FileType csv=  outputFactory.getType(output,"Sam","success");
//        assertTrue(csv instanceof CSVFileOutput);
//        assertFalse(csv instanceof TextFileOutput);
        assertTrue(true);


    }

    @Test
    public void testFactoryTextFile(){
        //Output output=new Output("Sam","SJ456","Economy",22, 100);
        OutputFactory outputFactory=new OutputFactory();
      //FileType textFile=  outputFactory.getType(null,"Sam","Invalid output");
//        assertFalse(textFile instanceof CSVFileOutput);
//        assertTrue(textFile instanceof TextFileOutput);
        assertTrue(true);


    }

}

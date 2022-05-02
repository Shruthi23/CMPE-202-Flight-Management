package test.output;

import junit.framework.TestCase;
import org.junit.Test;
import test.Output;
public class OutFactoryPatternDemoTest extends  TestCase {



    @Test
 public void shouldreturnCSV(){
        Output output=new Output("Sam","SJ456","Economy",22, 100);
        OutputFactory outputFactory=new OutputFactory();
      FileType csv=  outputFactory.getType(output,"Sam","success");
        assertTrue(csv instanceof CSVFileOutput);
        assertFalse(csv instanceof TextFileOutput);
        //assertTrue(true);
    }


}
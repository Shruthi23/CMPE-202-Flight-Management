package test;
import junit.framework.TestCase;
import org.junit.Test;
import test.output.CSVFileOutput;
import test.output.FileType;
import test.output.OutputFactory;
import test.output.TextFileOutput;
import test.validation.Chain;

public class CORTest extends  TestCase {
    @Test

    public void testCORCardShouldReturnTrue() {
        Chain chain = new Chain();
        chain.validate("6011788362937452");
        String res = chain.getRes();
        assertTrue(res.equals("Success"));

    }

    @Test

    public void testCORShouldReturnFalse() {
        Chain chain = new Chain();
        chain.validate("9983783");
        String res = chain.getRes();
        assertFalse(res.equals("Success"));
        assertTrue(res.equals("Invalid card"));

    }
}





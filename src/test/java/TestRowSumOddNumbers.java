import org.example.RowSumOddNumbers;
import org.junit.Assert;
import org.junit.Test;

public class TestRowSumOddNumbers {

    RowSumOddNumbers rowNumbers = new RowSumOddNumbers();
    @Test
    public void testSumOfOddNumbers(){
        Assert.assertEquals(8,rowNumbers.rowSumOddNumbers(2));
        Assert.assertEquals(512,rowNumbers.rowSumOddNumbers(8));
    }

}

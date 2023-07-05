import org.example.FindingMiddleLettersInString;
import org.example.RowSumOddNumbers;
import org.junit.Assert;
import org.junit.Test;

public class TestCases {

    RowSumOddNumbers rowNumbers = new RowSumOddNumbers();
    FindingMiddleLettersInString findingMiddleLettersInString = new FindingMiddleLettersInString();
    @Test
    public void testFindingMiddleLettersInString(){
        Assert.assertEquals("t",findingMiddleLettersInString.getMiddle("testing"));
        Assert.assertEquals("A",findingMiddleLettersInString.getMiddle("A"));
    }

    @Test
    public void testSumOfOddNumbers(){
        Assert.assertEquals(8,rowNumbers.rowSumOddNumbers(2));
        Assert.assertEquals(512,rowNumbers.rowSumOddNumbers(8));
    }

}

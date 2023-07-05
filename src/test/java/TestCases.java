import org.example.FindingMiddleLettersInString;
import org.example.RowSumOddNumbers;
import org.example.SortOddNumbers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCases {

    RowSumOddNumbers rowNumbers = new RowSumOddNumbers();
    FindingMiddleLettersInString findingMiddleLettersInString = new FindingMiddleLettersInString();

    SortOddNumbers sortOddNumbers = new SortOddNumbers();
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

    @Test
    public void testSortOddNumbers(){
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 },sortOddNumbers.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }
}

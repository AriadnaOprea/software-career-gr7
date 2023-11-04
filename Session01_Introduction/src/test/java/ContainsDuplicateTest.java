import org.example.ContainsDuplicate;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void noExceptionIsTrow(){
        int[] Array = {1,2,1,3,4,5,2,5};
        expectedException.expect(NumberFormatException.class);
        boolean result = ContainsDuplicate.containsDuplicate(Array);
        assertTrue(result);
    }
    @Test
    public void testEmptyArray(){
        int[] emptyArray = {};
        boolean result = ContainsDuplicate.containsDuplicate(emptyArray);
        assertFalse(result);

    }
    @Test
    public void testOneEllementArray(){
        int[] Array = {1};
        boolean result = ContainsDuplicate.containsDuplicate(Array);
        assertFalse(result);
    }
    @Test
    public void testOnlyOneDuplicate(){
        int[] numbers = {1,2,1,3,4,5};
        boolean result = ContainsDuplicate.containsDuplicate(numbers);
        assertTrue(result);
    }
    @Test
    public void testMultipleDuplicates(){
        int[] Array = {1,2,1,3,4,5,2,5};
        boolean result = ContainsDuplicate.containsDuplicate(Array);
        assertTrue(result);
    }



}

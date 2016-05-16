import junit.framework.TestCase;
import org.junit.BeforeClass;
import java.util.Arrays;
import java.util.List;

public class PerfectNumberImperativeTest extends TestCase {
    private static PerfectNumberImperative perfectNumber;
    private static List<Integer> factors = Arrays.asList(1, 2, 3);

    @BeforeClass
    public static void setUpBeforeClass(){
        perfectNumber = new PerfectNumberImperative();
    }

    public void testCanary() {
        assertTrue(true);
    }

    public void testGetFactorsReturnCorrectFactors() {
        assertEquals(factors, perfectNumber.getFactors(6));
    }

    public void testGetFactorsDoesNotAddExtraFactors() {
        int size = perfectNumber.getFactors(6).size();
        assertEquals(3, size);
    }

    public void testCheckIfPerfectGetsPerfectNumberCorrectly() {
        assertTrue(perfectNumber.isPerfect(496));
    }
    public void testCheckIfPerfectCorrectlyGetsNotPerfectForPositiveNumber() {
        assertFalse(perfectNumber.isPerfect(10));
    }

    public void testCheckIfPerfectCorrectlyGetsNotPerfectForNegativeNumber() {
        assertFalse(perfectNumber.isPerfect(-5));
    }

    public void testCheckIfPerfectCorrectlyGetsNotPerfectForZero() {
        assertFalse(perfectNumber.isPerfect(0));
    }

    public void testCheckIfPerfectCorrectlyGetsNotPerfectForOne() {
        assertFalse(perfectNumber.isPerfect(1));
    }
}
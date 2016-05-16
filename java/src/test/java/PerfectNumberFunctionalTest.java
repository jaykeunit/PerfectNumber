import junit.framework.TestCase;

public class PerfectNumberFunctionalTest extends TestCase {

    public void testCanary() {
        assertTrue(true);
    }

    public void testCheckIfPerfectGetsPerfectNumberCorrectly() {
        assertTrue(PerfectNumberFunctional.isPerfect(496));
    }
    public void testCheckIfPerfectCorrectlyGetsNotPerfectForPositiveNumber() {
        assertFalse(PerfectNumberFunctional.isPerfect(10));
    }

    public void testCheckIfPerfectCorrectlyGetsNotPerfectForNegativeNumber() {
        assertFalse(PerfectNumberFunctional.isPerfect(-5));
    }

    public void testCheckIfPerfectCorrectlyGetsNotPerfectForZero() {
        assertFalse(PerfectNumberFunctional.isPerfect(0));
    }

    public void testCheckIfPerfectCorrectlyGetsNotPerfectForOne() {
        assertFalse(PerfectNumberFunctional.isPerfect(1));
    }
}
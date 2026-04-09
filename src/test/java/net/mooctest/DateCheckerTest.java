package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.DateFormat;

public class DateCheckerTest {

	@Test
	public void test() {
		DateChecker a = new DateChecker();
	}


    // ================= compareDates =================

    @Test
    public void testCompareDates_True() {
        assertTrue(DateChecker.compareDates(25, 24));
    }
    // 覆盖：date > currentDate


    @Test
    public void testCompareDates_False_Equal() {
        assertFalse(DateChecker.compareDates(24, 24));
    }
    // 覆盖：date == currentDate


    @Test
    public void testCompareDates_False_Less() {
        assertFalse(DateChecker.compareDates(23, 24));
    }
    // 覆盖：date < currentDate


    // ================= convertDate =================

    @Test
    public void testConvertDate() {
        StringBuilder result = DateChecker.convertDate("1224");

        assertNotNull(result);
        assertEquals("1224", result.toString());
    }
    // 覆盖：convertDate


    // ================= current date =================

    @Test
    public void testGetCurrentYear() {
        int year = DateChecker.getCurrentYear();

        assertTrue(year >= 0 && year <= 99);
    }
    // 覆盖：yearFormat + Calendar


    @Test
    public void testGetCurrentMonth() {
        int month = DateChecker.getCurrentMonth();

        assertTrue(month >= 1 && month <= 12);
    }
    // 覆盖：monthFormat + Calendar
    
    @Test
    public void testGetCurrentYear_NotZero() {
        int year = DateChecker.getCurrentYear();

        assertNotEquals(0, year);
    }
}
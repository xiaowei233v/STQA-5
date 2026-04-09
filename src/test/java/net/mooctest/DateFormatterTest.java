package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.DateFormat;

public class DateFormatterTest {
	
	@Test
	public void test() {
		DateFormatter a = new DateFormatter();
	}

// ================= DateFormatter =================

    @Test
    public void testYearFormat() {
        DateFormat df = DateFormatter.yearFormat();

        assertNotNull(df);
        assertTrue(df.format(new java.util.Date()).length() == 2);
    }
    // 覆盖：yearFormat()


    @Test
    public void testMonthFormat() {
        DateFormat df = DateFormatter.monthFormat();

        assertNotNull(df);
        assertTrue(df.format(new java.util.Date()).length() == 2);
    }
    // 覆盖：monthFormat()
}
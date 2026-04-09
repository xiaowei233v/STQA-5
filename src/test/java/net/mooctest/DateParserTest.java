package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateParserTest {

	@Test
	public void test() {
		DateParser a = new DateParser();
	}
	
    // ================= parseDate(StringBuilder) =================

    @Test
    public void testParseDate_WithSlash() {
        StringBuilder date = new StringBuilder("12/24");

        StringBuilder result = DateParser.parseDate(date);

        assertEquals("1224", result.toString());
    }
    // 覆盖：contains "/" → 删除字符


    @Test
    public void testParseDate_WithoutSlash() {
        StringBuilder date = new StringBuilder("1224");

        StringBuilder result = DateParser.parseDate(date);

        assertEquals("1224", result.toString());
    }
    // 覆盖：没有 "/" → 不变


    // ================= parseDate(StringBuilder, int, int) =================

    @Test
    public void testParseDate_Substring() {
        StringBuilder date = new StringBuilder("1224");

        int result = DateParser.parseDate(date, 0, 2);

        assertEquals(12, result);
    }
    // 覆盖：正常截取，start 和 end


    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testParseDate_Substring_OutOfBounds() {
        StringBuilder date = new StringBuilder("12");

        DateParser.parseDate(date, 0, 5);
    }
    // 覆盖：start / end 超出范围
}
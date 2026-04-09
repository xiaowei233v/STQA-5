package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class CreditCardParserTest {
	
    @Test
    public void test() {
    	CreditCardParser a = new CreditCardParser();
    }

    // ================= parseNumber =================

    @Test
    public void testParseNumber_Normal() {
        List<Integer> result = CreditCardParser.parseNumber("12345");

        assertEquals(Arrays.asList(1,2,3,4,5), result);
    }
    // ✅ 覆盖：loop正常执行
    // ✅ 杀 mutation：返回值错误 / add逻辑删除


    @Test
    public void testParseNumber_Empty() {
        List<Integer> result = CreditCardParser.parseNumber("");

        assertNotNull(result);
        assertEquals(0, result.size());
    }
    // ✅ 覆盖：loop不执行（关键分支）


    @Test
    public void testParseNumber_NonDigit() {
        List<Integer> result = CreditCardParser.parseNumber("1a3");

        // 'a' -> 10（Character.getNumericValue）
        assertEquals(Arrays.asList(1,10,3), result);
    }
    // ✅ 覆盖：Character.getNumericValue 分支
    // ✅ 杀 mutation：转换逻辑


    // ================= parseIIN =================

    @Test
    public void testParseIIN_NormalFullLength() {
        List<Integer> list = Arrays.asList(4,5,6,7);

        int result = CreditCardParser.parseIIN(list, 4);

        assertEquals(4567, result);
    }
    // ✅ 覆盖：range == size


    @Test
    public void testParseIIN_Prefix() {
        List<Integer> list = Arrays.asList(4,5,6,7);

        int result = CreditCardParser.parseIIN(list, 2);

        assertEquals(45, result);
    }
    // ✅ 覆盖：range < size

}
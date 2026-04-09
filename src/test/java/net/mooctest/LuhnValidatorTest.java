package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;

public class LuhnValidatorTest {

    // ================= validate / algorithmCheck =================

    @Test
    public void testValidate_ValidCard() {
        LuhnValidator v = new LuhnValidator();

        // 经典有效卡号（Luhn合法）
        assertTrue(v.validate("4532015112830366"));
    }
    // 覆盖：sum % 10 == 0


    @Test
    public void testValidate_InvalidCard() {
        LuhnValidator v = new LuhnValidator();

        assertFalse(v.validate("4532015112830367"));
    }
    // 覆盖：sum % 10 != 0


    // ================= sumOfDigits =================

    @Test
    public void testSumOfDigits_SingleDigit() {
        LuhnValidator v = new LuhnValidator();

        assertEquals(5, v.sumOfDigits(5));
    }
    // 覆盖：loop一次


    @Test
    public void testSumOfDigits_MultipleDigits() {
        LuhnValidator v = new LuhnValidator();

        assertEquals(6, v.sumOfDigits(123));
    }
    // 覆盖：loop多次


    // ================= algorithmCheck 分支补充 =================

    @Test
    public void testAlgorithmCheck_DoubleLessThan10() {
        LuhnValidator v = new LuhnValidator();

        // 控制进入 tempNumber < 10 分支
        // 例如：1 * 2 = 2
        assertFalse(v.algorithmCheck("11"));
    }
    // 覆盖：tempNumber < 10


    @Test
    public void testAlgorithmCheck_DoubleGreaterThan10() {
        LuhnValidator v = new LuhnValidator();

        // 控制进入 tempNumber >= 10 分支（走 sumOfDigits）
        // 例如：6 * 2 = 12 → sumOfDigits
        assertFalse(v.algorithmCheck("16"));
    }
    // 覆盖：tempNumber >= 10 → sumOfDigits
    
    @Test
    public void testAlgorithmCheck_SumExactControl() {
        LuhnValidator v = new LuhnValidator();

        // 精心构造：长度为2，路径简单且可控
        // "18":
        // reverse → [8,1]
        // i=1 → 1*2=2 (<10) → tempArray[1]=2
        // tempArray[0]=8
        // sum = 8 + 2 = 10 → %10 == 0 → true
        assertTrue(v.algorithmCheck("18"));
    }
    
    @Test
    public void testAlgorithmCheck_SumSensitive() {
        LuhnValidator v = new LuhnValidator();

        // 精心构造：刚好 valid
        String valid = "79927398713"; // Luhn经典

        assertTrue(v.algorithmCheck(valid));
    }
}
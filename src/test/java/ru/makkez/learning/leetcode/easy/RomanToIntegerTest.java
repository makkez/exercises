package ru.makkez.learning.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    public void romanToInt_WhenIII_Then3() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    public void romanToInt_WhenLVIII_Then58() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void romanToInt_WhenMCMXCIV_Then1994() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}

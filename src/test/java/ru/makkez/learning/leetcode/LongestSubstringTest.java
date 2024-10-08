package ru.makkez.learning.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringTest {

    @Test
    public void longestSubstringTest1() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(0, longestSubstring.lengthOfLongestSubstring(""));
    }

    @Test
    public void longestSubstringTest2() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(1, longestSubstring.lengthOfLongestSubstring("a"));
    }

    @Test
    public void longestSubstringTest3() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void longestSubstringTest4() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(1, longestSubstring.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void longestSubstringTest5() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(3, longestSubstring.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void longestSubstringTest6() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(6, longestSubstring.lengthOfLongestSubstring("aaaaaaaaaaaaaaaabcefgaaaaa"));
    }

    @Test
    public void longestSubstringTest7() {
        LongestSubstring longestSubstring = new LongestSubstring();
        Assertions.assertEquals(6, longestSubstring.lengthOfLongestSubstring("abcadef"));
    }
}

package ru.makkez.learning.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome1TestWhenInput121ThenTrue() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertTrue(palindromeNumber.isPalindrome_1(121));
        Assertions.assertTrue(palindromeNumber.isPalindrome_2(121));
    }

    @Test
    public void isPalindrome1TestWhenInputMinus121ThenFalse() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertFalse(palindromeNumber.isPalindrome_1(-121));
        Assertions.assertFalse(palindromeNumber.isPalindrome_2(-121));
    }

    @Test
    public void isPalindrome1TestWhenInput0ThenTrue() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertTrue(palindromeNumber.isPalindrome_1(0));
        Assertions.assertTrue(palindromeNumber.isPalindrome_2(0));
    }

    @Test
    public void isPalindrome1TestWhenInput10ThenFalse() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertFalse(palindromeNumber.isPalindrome_1(10));
        Assertions.assertFalse(palindromeNumber.isPalindrome_2(10));
    }

    @Test
    public void isPalindrome1TestWhenInput2222ThenTrue() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertTrue(palindromeNumber.isPalindrome_1(2222));
        Assertions.assertTrue(palindromeNumber.isPalindrome_2(2222));
    }

    @Test
    public void isPalindrome1TestWhenInput1001ThenTrue() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertTrue(palindromeNumber.isPalindrome_1(1001));
        Assertions.assertTrue(palindromeNumber.isPalindrome_2(1001));
    }

    @Test
    public void isPalindrome1TestWhenInput1000021ThenFalse() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertFalse(palindromeNumber.isPalindrome_1(1000021));
        Assertions.assertFalse(palindromeNumber.isPalindrome_2(1000021));
    }
}

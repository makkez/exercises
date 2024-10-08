package ru.makkez.learning.leetcode.easy;

/**
 * Задано целое число x, верните, true если x это палиндром в противном случае false.
 * Целое число является палиндромом, если оно одинаково читается вперёд и назад. Например, число 121 - палиндром, а 123 нет.
 *
 * Пример 1:
 * Ввод: x = 121
 * Вывод:true
 * Пояснение: 121 читается как 121 слева направо и справа налево.
 *
 * Пример 2:
 * Ввод: x = -121
 * Вывод:false
 * Пояснение: Слева направо написано -121. Справа налево он становится 121-. Следовательно, это не палиндром.
 *
 * Пример 3:
 * Ввод: x = 10
 * Вывод:false
 * Объяснение: Читается 01 справа налево. Следовательно, это не палиндром.
 *
 * Ограничения:
 * -2^31 <= x <= 2^(31 - 1)
 *
 * Продолжение: Не могли бы вы решить задачу, не преобразовывая целое число в строку?
 */
public class PalindromeNumber {
    public boolean isPalindrome_1(int x) {
        if (x < 0) { return false; }
        if (x < 10) { return true; }

        int rInd = 0, lInd = (int) Math.log10(Math.abs(x)), rVal, lVal;

        while (rInd < lInd) {
            rVal = (int) ((x % (int) Math.pow(10, (rInd + 1))) * Math.pow(10.0, -rInd));
            lVal = ((int) (x * Math.pow(10.0, -lInd))) % 10;

            if (rVal != lVal) { return false; }
            rInd++;
            lInd--;
        }

        return true;
    }

    public boolean isPalindrome_2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) { return false; }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
}

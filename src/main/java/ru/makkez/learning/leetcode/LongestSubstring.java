package ru.makkez.learning.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Учитывая строку s, найдите длину самого длинной подстроки без повторяющихся символов.
 *
 * Пример 1:
 * Ввод: s = "abcabcbb"
 * Результат:3
 * Объяснение: Ответ "abc" длиной 3.
 *
 * Пример 2:
 * Ввод: s = "bbbbb"
 * Вывод:1
 * Объяснение: Ответ "b" длиной 1.
 *
 * Пример 3:
 * Ввод: s = "pwwkew"
 * Результат:3
 * Пояснение: Ответ "wke" длиной 3.
 * Обратите внимание, что ответ должен быть подстрокой, "pwke" - это подпоследовательность, а не подстрока.
 *
 * Ограничения:
 * 0 <= s.length <= 5 * 10^4
 * s состоит из английских букв, цифр, символов и пробелов.
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

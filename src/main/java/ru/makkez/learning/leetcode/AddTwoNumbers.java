package ru.makkez.learning.leetcode;

/**
 * 2. Сложить два числа
 *
 * Вам предоставлены два непустых связанных списка, представляющих два неотрицательных целых числа. Цифры хранятся в
 * обратном порядке, и каждый из их узлов содержит одну цифру. Сложите два числа и верните сумму в виде связанного списка.
 * Вы можете предположить, что эти два числа не содержат никакого начального нуля, за исключением самого числа 0.
 *
 * Пример 1:
 * Список 1:    2 -> 4 -> 3
 * Список 2:    5 -> 6 -> 4
 * Результат:   7 -> 0 -> 8
 *
 * Ввод: l1 = [2,4,3], l2 = [5,6,4]
 * Вывод: [7,0,8]
 * Пояснение: 342 + 465 = 807.
 * Пример 2:
 *
 * Ввод: l1 = [0], l2 = [0]
 * Вывод: [0]
 * Пример 3:
 *
 * Ввод: l1 = [9,9,9,9,9,9], l2 = [9,9,9,9]
 * Вывод: [8,9,9,9,0,0,0,1]
 *
 * Ограничения:
 *
 * Количество узлов в каждом связанном списке находится в диапазоне [1, 100].
 * 0 <= Node.val <= 9
 * Гарантируется, что список представляет число, в котором нет начальных нулей.
 */
public class AddTwoNumbers {

    private boolean appendix = false;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (checkNext(l1, l2)) {
            int tmpSum = (l1 != null ? l1.val : 0)
                    + (l2 != null ? l2.val : 0)
                    + (appendix ? 1 : 0);
            appendix = false;

            if (tmpSum >= 10) {
                tmpSum -= 10;
                appendix = true;
            }
            return new ListNode(tmpSum, addTwoNumbers(
                    (l1 == null || l1.next == null) ? null : l1.next,
                    (l2 == null || l2.next == null) ? null : l2.next
            ));
        } else {
            return null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private boolean checkNext(ListNode l1, ListNode l2) {
        return l1 != null || l2 != null || appendix;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

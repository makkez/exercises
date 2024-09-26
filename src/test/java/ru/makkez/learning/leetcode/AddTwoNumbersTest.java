package ru.makkez.learning.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static AddTwoNumbers.ListNode createListNode(int[] values) {
        if (values == null || values.length == 0) { return null; }
        AddTwoNumbers.ListNode res = new AddTwoNumbers.ListNode(values[values.length - 1]);
        for (int i = values.length - 2; i >= 0; i--) {
            res = new AddTwoNumbers.ListNode(values[i], res);
        }
        return res;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void assertListNode(AddTwoNumbers.ListNode expected, AddTwoNumbers.ListNode actual) {
        while (expected != null || actual != null) {
            Assertions.assertEquals(
                    expected != null ? expected.val : null,
                    actual != null ? actual.val : null
            );
            expected = expected != null ? expected.next : null;
            actual = actual != null ? actual.next : null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void addTwoNumbersTest1() {
        AddTwoNumbers.ListNode l1 = createListNode(new int[] {2, 4, 3});
        AddTwoNumbers.ListNode l2 = createListNode(new int[] {5, 6, 4});
        AddTwoNumbers.ListNode expected = createListNode(new int[] {7, 0, 8});
        AddTwoNumbers atn = new AddTwoNumbers();
        AddTwoNumbers.ListNode actual = atn.addTwoNumbers(l1, l2);
        assertListNode(expected, actual);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void addTwoNumbersTest2() {
        AddTwoNumbers.ListNode l1 = createListNode(new int[] {0});
        AddTwoNumbers.ListNode l2 = createListNode(new int[] {0});
        AddTwoNumbers.ListNode expected = createListNode(new int[] {0});
        AddTwoNumbers atn = new AddTwoNumbers();
        AddTwoNumbers.ListNode actual = atn.addTwoNumbers(l1, l2);
        assertListNode(expected, actual);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void addTwoNumbersTest3() {
        AddTwoNumbers.ListNode l1 = createListNode(new int[] {9,9,9,9,9,9,9});
        AddTwoNumbers.ListNode l2 = createListNode(new int[] {9,9,9,9});
        AddTwoNumbers.ListNode expected = createListNode(new int[] {8,9,9,9,0,0,0,1});
        AddTwoNumbers atn = new AddTwoNumbers();
        AddTwoNumbers.ListNode actual = atn.addTwoNumbers(l1, l2);
        assertListNode(expected, actual);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void addTwoNumbersTest4() {
        AddTwoNumbers.ListNode l1 = createListNode(new int[] {9,9});
        AddTwoNumbers.ListNode l2 = createListNode(new int[] {9});
        AddTwoNumbers.ListNode expected = createListNode(new int[] {8,0,1});
        AddTwoNumbers atn = new AddTwoNumbers();
        AddTwoNumbers.ListNode actual = atn.addTwoNumbers(l1, l2);
        assertListNode(expected, actual);
    }
}

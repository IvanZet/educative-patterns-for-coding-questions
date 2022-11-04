package net.ivanzykov.patternscodingquestions.fastandslowpointers;

import junit.framework.TestCase;

public class LinkedListCycleTest extends TestCase {

    public void testHasCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        assertFalse(LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        assertTrue(LinkedListCycle.hasCycle(head));
    }
}
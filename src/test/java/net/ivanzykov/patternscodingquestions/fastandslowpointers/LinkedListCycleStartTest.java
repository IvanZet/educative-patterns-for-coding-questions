package net.ivanzykov.patternscodingquestions.fastandslowpointers;

import junit.framework.TestCase;

public class LinkedListCycleStartTest extends TestCase {

    public void testFindCycleStart() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        assertNull(LinkedListCycleStart.findCycleStart(head));

        ListNode cycleStart = head.next.next;
        head.next.next.next.next.next.next = cycleStart;
        assertEquals(cycleStart, LinkedListCycleStart.findCycleStart(head));
    }
}
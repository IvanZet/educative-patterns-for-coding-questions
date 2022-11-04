package net.ivanzykov.patternscodingquestions.fastandslowpointers;

class LinkedListCycleStart {

    public static ListNode findCycleStart(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int cycleLen = 0;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                // found the cycle
                cycleLen = calculateLength(slow);
                break;
            }
        }

        if (cycleLen > 0) {
            return findStart(cycleLen, head);
        }
        return null;
    }

    private static int calculateLength(ListNode slow) {
        ListNode current = slow;
        int cycleLength = 0;

        do {
            current = current.next;
            cycleLength++;
        } while (current != slow);

        return cycleLength;
    }

    private static ListNode findStart(int cycleLen, ListNode head) {
        ListNode a = head;
        ListNode b = head;
        // Move pointer b cycleLen times ahead of pointer a
        for (int i = 0; i < cycleLen; i++) {
            b = b.next;
        }

        while (a != b) {
            a = a.next;
            b = b.next;
        }

        return a;
    }
}

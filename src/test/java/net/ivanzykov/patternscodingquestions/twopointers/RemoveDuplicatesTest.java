package net.ivanzykov.patternscodingquestions.twopointers;

import junit.framework.TestCase;

public class RemoveDuplicatesTest extends TestCase {

    public void testRemove() {
        int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
        assertEquals(4, RemoveDuplicates.remove(arr));
    }
}
package net.ivanzykov.patternscodingquestions.mergeintervals;

import java.util.*;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new LinkedList<>(intervals);

        tryMerging(mergedIntervals);

        if (mergedIntervals.equals(intervals)) {
            return intervals;
        }

        return merge(mergedIntervals);
    }

    public static void tryMerging(List<Interval> intervals) {
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = 0; j < intervals.size(); j++) {
                Interval a = intervals.get(i);
                Interval b = intervals.get(j);

                // Check that a and b don't overlap
                if (i == j || (a.start < b.start && a.end < b.start) || (b.start < a.start && b.end < a.start)) {
                    continue;
                }

                // b ends after a
                if (a.start <= b.start && b.start < a.end && a.end <= b.end) {
                    mergeTwoIntervals(i, j, a, b, intervals);
                    return;
                }

                // a completely overlaps b
                if (a.start <= b.start && b.end <= a.end) {
                    mergeTwoIntervals(i, j, a, b, intervals);
                    return;
                }

                // a ends after b
                if (b.start <= a.start && a.start < b.end && b.end <= a.end) {
                    mergeTwoIntervals(i, j, a, b, intervals);
                    return;
                }

                // b completely overlaps a
                if (b.start <= a.start && a.end <= b.end) {
                    mergeTwoIntervals(i, j, a, b, intervals);
                    return;
                }
            }
        }
    }

    public static void mergeTwoIntervals(int i, int j, Interval a, Interval b, List<Interval> intervals) {
        intervals.remove(Math.max(i, j));
        intervals.remove(Math.min(i, j));
        intervals.add(new Interval(Math.min(a.start, b.start), Math.max(a.end, b.end)));
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(6, 7));
        input.add(new Interval(2, 4));
        input.add(new Interval(5, 9));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();

        input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 6));
        input.add(new Interval(3, 5));
        System.out.print("Merged intervals: ");
        for (Interval interval : MergeIntervals.merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");
        System.out.println();
    }
}

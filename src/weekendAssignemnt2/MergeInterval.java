package weekendAssignemnt2;

import java.util.*;

public class MergeInterval {
    private List<List<Integer>> intervals;

    public void input(List<List<Integer>> intervals) {
        if (intervals == null) {
            throw new NullPointerException("can not pass in NULL");
        }
        this.intervals = intervals;
        Collections.sort(intervals, (a, b) -> a.get(0) - b.get(0));
    }

    public void logic() {
        List<List<Integer>> result = new ArrayList<>();

        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);

        for (int i = 1; i < intervals.size(); i++) {
            int currentStart = intervals.get(i).get(0);
            int currentEnd = intervals.get(i).get(1);
            if (end < currentStart) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(start);
                tmp.add(end);
                result.add(tmp);
                start = currentStart;
                end = currentEnd;
            } else {
                end = Math.max(end, currentEnd);
            }
        }
        result.add(Arrays.asList(start, end));
        this.intervals = result;
    }

    public void outPut() {
        System.out.println(intervals);
    }

    public static void main(String[] args) {
        List<List<Integer>> intervals = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(8, 10),
                Arrays.asList(2, 6),
                Arrays.asList(15, 18)
        );
        MergeInterval mergeInterval = new MergeInterval();
        mergeInterval.input(intervals);
        mergeInterval.logic();
        mergeInterval.outPut();
    }
}

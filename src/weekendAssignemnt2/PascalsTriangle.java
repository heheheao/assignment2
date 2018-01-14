package weekendAssignemnt2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjunxu on 1/13/18.
 */
public class PascalsTriangle {
    private int rowNumber;
    private List<List<Integer>> outPut = new ArrayList<>();

    /**
     * take user's input
     * @param rowNumber
     */
    public void input(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * implements logic
     */
    public void logic() {
        List<Integer> cache = new ArrayList<>();
        for (int i = 0; i < rowNumber; i++) {
            cache.add(0, 1);
            for (int j = 1; j < cache.size() - 1; j++) {
                cache.set(j, cache.get(j) + cache.get(j + 1));
            }
            outPut.add(new ArrayList<>(cache));
        }
    }

    /**
     * show result to user
     */
    public void output() {
        System.out.println(outPut);
    }

    public static void main(String[] args) {

        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        pascalsTriangle.input(5);
        pascalsTriangle.logic();
        pascalsTriangle.output();
    }
}

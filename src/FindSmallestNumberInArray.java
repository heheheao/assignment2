/**
 * Created by zhangjunxu on 1/9/18.
 */
public class FindSmallestNumberInArray {
    private int[] nums;
    private int length;
    private int min;

    /**
     * take users Input
     *
     * @param num
     * @param length
     */
    public void input(int[] num, int length) {
        this.nums = num;
        this.length = length;
        this.min = Integer.MAX_VALUE;
    }


    /**
     * Implement logic statment here
     */

    public void logic() {
        for (int i : nums) {
            min = Math.min(i, min);
        }
    }

    private void outPut() {
        System.out.println("Smallest: " + min);
    }

    public static void main(String[] args) {
        int[] a={1,2,5,6,3,2};
        int[] b={44,66,99,77,33,22,55};

        FindSmallestNumberInArray mFindSmallestNumberInArray =
                new FindSmallestNumberInArray();
        mFindSmallestNumberInArray.input(a, a.length);
        mFindSmallestNumberInArray.logic();
        mFindSmallestNumberInArray.outPut();
        mFindSmallestNumberInArray.input(b, b.length);
        mFindSmallestNumberInArray.logic();
        mFindSmallestNumberInArray.outPut();
    }
}

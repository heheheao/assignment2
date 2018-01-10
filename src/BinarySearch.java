/**
 * Created by zhangjunxu on 1/9/18.
 */
public class BinarySearch {
    private int[] canadiates;
    private int target;
    private int first;
    private int last;
    private int index = -1;

    /**
     * take the users input
     *
     * @param canadiates: int[]
     * @param target:     fins the target index int
     */
    public void input(int[] canadiates, int first, int last, int target) {
        this.canadiates = canadiates;
        this.target = target;
        this.first = first;
        this.last = last;
    }

    /**
     * Implements binary search logic here;
     */
    public void logic() {
        int left = first;
        int right = last;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (canadiates[mid] == target) {
                index = mid;
                return;
            }
            if (canadiates[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (canadiates[left] == target) {
            index = left;
        }
        if (canadiates[right] == target) {
            index = right;
        }
    }

    /**
     * show result to user
     */
    public void outPut() {
        if (index != -1) {
            System.out.println("Element is found at index: " + index);
        } else {
            System.out.println("Element is not found!");
        }
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;
        int last = arr.length - 1;
        BinarySearch mBinarySearch = new BinarySearch();
        mBinarySearch.input(arr, 0, last, target);
        mBinarySearch.logic();
        mBinarySearch.outPut();
    }

}

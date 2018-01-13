package weekendAssignemnt2;

/**
 * Created by zhangjunxu on 1/13/18.
 */
public class RotatedArray {

    private int[] nums;
    private int[] inputNums;
    private int index;

    /**
     * take the user input
     * @param nums
     * @param index
     */
    public void input(int[] nums, int index) {
        this.nums = nums;
        this.inputNums = nums.clone();
        this.index = index;
    }

    /**
     * Implements Rotated logic
     */
    public void logic() {
        int partition  = index % nums.length;
        swap(0, partition);
        swap(partition + 1, nums.length - 1);
        swap(0, nums.length - 1);
    }

    /**
     * show resutl to user
     */
    public void output() {
        System.out.print("input int Array :");
        for(int i : inputNums) {
            System.out.print(" " +i);
        }

        System.out.println();

        System.out.print("after rotated:");
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void swap(int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        RotatedArray rotatedArray = new RotatedArray();
        rotatedArray.input(nums, 3);
        rotatedArray.logic();
        rotatedArray.output();

    }
}






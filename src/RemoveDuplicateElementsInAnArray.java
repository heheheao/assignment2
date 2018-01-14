/**
 * Created by zhangjunxu on 1/9/18.
 */
public class RemoveDuplicateElementsInAnArray {
    private int[] nums;
    private int result = -1;
    private int length;

    /**
     * take the input from user
     * @param nums
     * @param length
     */
    public void input(int[] nums, int length) {
        this.nums = nums;
        this.length = length;
    }

    /**
     * Implements logic here
     */
    public void logic() {
        if (length==0 || length==1){
            return;
        }
        int[] temp = new int[length];
        int j = 0;
        for (int i=0; i<length-1; i++){
            if (nums[i] != nums[i+1]){
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[length-1];
        // Changing original array
        for (int i=0; i<j; i++){
            nums[i] = temp[i];
        }
        result = j;
    }

    /**
     * show the result to user
     */

    public void outPut() {
        if(result == -1) {
            for(int i = 0; i < length; i++) {
                System.out.print(nums[i]+" ");
            }
        } else {
            for(int i = 0; i < result; i++) {
                System.out.print(nums[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
        RemoveDuplicateElementsInAnArray mRemoveDuplicateElementsInAnArray =
                new RemoveDuplicateElementsInAnArray();

        mRemoveDuplicateElementsInAnArray.input(arr, length);
        mRemoveDuplicateElementsInAnArray.logic();
        mRemoveDuplicateElementsInAnArray.outPut();
    }
}

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhangjunxu on 1/9/18.
 */
public class OddEvenInArray {
    private List<Integer> oddList;
    private List<Integer> evenList;
    private int[] nums;

    /**
     * take user input
     * @param nums
     */
    public void input(int[] nums){
        this.nums = nums;
        oddList = new LinkedList<>();
        evenList = new LinkedList<>();
    }

    /**
     * Implements logic here
     */
    public void logic() {
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);
            }
        }
    }

    /**
     * show result to user;
     */
    public void outPut() {
        System.out.print("Odd elements: ");
        for(Integer i : oddList) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Even elements: ");
        for(Integer i : evenList) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};
        OddEvenInArray mOddEvenInArray = new OddEvenInArray();
        mOddEvenInArray.input(a);
        mOddEvenInArray.logic();
        mOddEvenInArray.outPut();
    }


}

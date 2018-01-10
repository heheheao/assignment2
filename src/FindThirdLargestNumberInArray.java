/**
 * Created by zhangjunxu on 1/9/18.
 */
public class FindThirdLargestNumberInArray {
    private int lenght;
    private int[] nums;

    /**
     * take user's input
     * @param nums : int[]
     * @param length: length of the nums
     */
    public void input(int[] nums, int length) {
        this.nums = nums;
        this.lenght = length;
    }

    /**
     * Implements find Thrid Lagest value logic here
     */
    public void logic(){
        int temp;
        for (int i = 0; i < lenght; i++)
        {
            for (int j = i + 1; j < lenght; j++)
            {
                if (nums[i] > nums[j])
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    /**
     * shou result to user
     */
    public void outPut() {
        System.out.println("Third Largest: " + nums[lenght - 3]);
    }

    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,77,33,22,55};
        FindThirdLargestNumberInArray mfindThirdLargestNumberInArray =
                new FindThirdLargestNumberInArray();
        mfindThirdLargestNumberInArray.input(a, 6);
        mfindThirdLargestNumberInArray.logic();
        mfindThirdLargestNumberInArray.outPut();
        mfindThirdLargestNumberInArray.input(b, 7);
        mfindThirdLargestNumberInArray.logic();
        mfindThirdLargestNumberInArray.outPut();
    }
}

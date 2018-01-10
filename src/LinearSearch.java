/**
 * Created by zhangjunxu on 1/9/18.
 */
public class LinearSearch {
    private int[] canadiates;
    private int target;
    private boolean find = false;
    private int targetIndex;

    /**
     * take the users input
     * @param canadiates: int[]
     * @param target: int value, use to find the index of target in canadiates
     */
    private void input(int[] canadiates, int target) {
        this.canadiates = canadiates;
        this.target = target;
    }

    /**
     * implement linearSrearch logic in this method
     */
    public void logic() {
        for(int i = 0; i < canadiates.length; i++) {
            if(canadiates[i] == target) {
                targetIndex = i;
                find = true;
                return;
            }
        }
    }

    /**
     * show result to user
     */
    public void outPut() {
        if(find) {
            System.out.println( target +" is found at index: "+ targetIndex);
        } else {
            System.out.println("did not find target");
        }
    }

    public static void main(String[] args) {
        int[] a1= {10,20,30,50,70,90};
        int key = 50;
        LinearSearch mLinearSearch = new LinearSearch();
        mLinearSearch.input(a1, key);
        mLinearSearch.logic();
        mLinearSearch.outPut();
    }
}

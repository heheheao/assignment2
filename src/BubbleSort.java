/**
 * Created by zhangjunxu on 1/9/18.
 */
public class BubbleSort {
    private int[] canadiatesBeforeSort;
    private int[] canadiatesAfterSort;

    /**
     * take user input
     * @param canadiates take the int array
     */
    public void input(int[] canadiates) {
        this.canadiatesBeforeSort = canadiates;
        this.canadiatesAfterSort = canadiates.clone();
    }

    /**
     * implement bubble sort logic here
     */
    public void logic() {
        int temp;
        int n = canadiatesAfterSort.length;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(canadiatesAfterSort[j-1] > canadiatesAfterSort[j]){
                    //swap elements
                    temp = canadiatesAfterSort[j-1];
                    canadiatesAfterSort[j-1] = canadiatesAfterSort[j];
                    canadiatesAfterSort[j] = temp;
                }

            }
        }
    }

    /**
     * show result to user
     */
    public void outPut() {
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < canadiatesBeforeSort.length; i++){
            System.out.print(canadiatesBeforeSort[i] + " ");
        }
        System.out.println();


        System.out.println("Array After Bubble Sort");
        for(int i=0; i < canadiatesAfterSort.length; i++){
            System.out.print(canadiatesAfterSort[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr ={3,60,35,2,45,320,5};
        BubbleSort mBubbleSort = new BubbleSort();
        mBubbleSort.input(arr);
        mBubbleSort.logic();
        mBubbleSort.outPut();
    }

}

/**
 * Created by zhangjunxu on 1/9/18.
 */
public class InsertionSort {
    private int[] canadiatesBeforeSort;
    private int[] canadiatesAfterSort;

    /**
     * take the user's input
     * @param canadiates : int[]
     */
    public void imput(int[] canadiates) {
        this.canadiatesBeforeSort = canadiates;
        this.canadiatesAfterSort = canadiates.clone();
    }

    /**
     * Implements insertion sort logic here
     */
    public void logic() {
        for (int j = 1; j < canadiatesAfterSort.length; j++) {
            int key = canadiatesAfterSort[j];
            int i = j-1;
            while ( (i > -1) && ( canadiatesAfterSort [i] > key ) ) {
                canadiatesAfterSort [i+1] = canadiatesAfterSort [i];
                i--;
            }
            canadiatesAfterSort[i+1] = key;
        }
    }

    /**
     * show result to user
     */
    public void outPut() {
        System.out.println("Before Insertion Sort");
        for(int i:canadiatesBeforeSort){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("After Insertion Sort");
        for(int i:canadiatesAfterSort){
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        InsertionSort mInsertionSort = new InsertionSort();
        mInsertionSort.imput(arr1);
        mInsertionSort.logic();
        mInsertionSort.outPut();
    }
}

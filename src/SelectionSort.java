/**
 * Created by zhangjunxu on 1/9/18.
 */
public class SelectionSort {
    private int[] candidatesBeforeSort;
    private int[] candidatesAfterSort;

    /**
     * take the user input
     * @param candidates : take a int array
     */
    public void input(int[] candidates) {
        this.candidatesAfterSort = candidates;
        this.candidatesBeforeSort = candidates.clone();
    }


    /**
     * implements selection sort logic here
     */
    public void logic () {
        for (int i = 0; i < candidatesAfterSort.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < candidatesAfterSort.length; j++){
                if (candidatesAfterSort[j] < candidatesAfterSort[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = candidatesAfterSort[index];
            candidatesAfterSort[index] = candidatesAfterSort[i];
            candidatesAfterSort[i] = smallerNumber;
        }
    }


    public void outPut() {
        System.out.println("Before Selection Sort");
        for(int i:candidatesBeforeSort){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("After Selection Sort");
        for(int i:candidatesAfterSort){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        SelectionSort mSelectionSort = new SelectionSort();
        mSelectionSort.input(arr1);
        mSelectionSort.logic();
        mSelectionSort.outPut();
    }
}

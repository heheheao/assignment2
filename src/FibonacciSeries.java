/**
 * Created by zhangjunxu on 1/9/18.
 */
public class FibonacciSeries {
    private int count;
    private int[] resultArra;

    /**
     * take user input
     *
     * @param count is integer number passe in by user
     */
    public void input(int count) {
        this.count = count;
        resultArra = new int[count];

    }

    /**
     * implements logic
     */
    public void logic() {
        int n1=0,n2=1,n3;
        resultArra[0] = n1;
        resultArra[1] = n2;
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            resultArra[i] = n3;
            n1 = n2;
            n2 = n3;
        }
    }

    /**
     * show result
     */
    public void outPut() {
        for(int i : resultArra) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fb = new FibonacciSeries();
        fb.input(10);
        fb.logic();
        fb.outPut();
    }
}

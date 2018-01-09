/**
 * Created by zhangjunxu on 1/9/18.
 */
public class PrimeNumber {
    private int flag = 0;
    private int candidate;

    /**
     * take user input
     * @param candidate : integer number need to pass in
     */
    public void input(int candidate) {
        this.candidate = candidate;
    }

    /**
     * implements the logic statement here
     */
    public void logic() {
        if (candidate == 0 || candidate == 1) {
           return;
        } else {
            int m = candidate / 3;
            for (int i = 2; i <= m; i++) {
                if (candidate % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }//end of else
    }

    /**
     * show out put
     */
    public void outPut() {

        if (candidate == 0 || candidate == 1) {
            System.out.println(candidate + " is not prime number");
        } else if (flag == 0) {
            System.out.println(candidate + " is prime number");
        } else {
            System.out.println(candidate + " is not prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumber mPrimeNumber = new PrimeNumber();
        mPrimeNumber.input(3);
        mPrimeNumber.logic();
        mPrimeNumber.outPut();
    }
}

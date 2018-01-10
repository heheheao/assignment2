/**
 * Created by zhangjunxu on 1/9/18.
 */
public class PalindromeNumber {

    private int canadiate;
    private int valueAfterReverse = 0;

    /**
     * take canadiate value input
     *
     * @param canadiate
     */
    public void input(int canadiate) {
        this.canadiate = canadiate;
    }

    /**
     * implement logic here
     */
    public void logic() {
        int temp = canadiate;
        while (temp != 0) {
            int mod = temp % 10;
            valueAfterReverse = valueAfterReverse * 10 + mod;
            temp = temp / 10;
        }
    }

    /**
     * show the resutl to user
     */
    public void outPut() {
        if (canadiate == valueAfterReverse) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    }


    public static void main(String[] args) {
        PalindromeNumber mPalindromeNumber = new PalindromeNumber();
        mPalindromeNumber.input(353);
        mPalindromeNumber.logic();
        mPalindromeNumber.outPut();
    }
}

/**
 * Created by zhangjunxu on 1/9/18.
 */
public class ArmstrongNumber {
    private int canadiate;
    private int result = 0;

    /**
     * take the int as canadiate number, to check whether the value is
     * ArmstrongNumber or not
     * @param canadiate integer Value
     */
    public void input(int canadiate) {
        this.canadiate = canadiate;
    }

    /**
     * implements armstrong Number logic
     */
    public void logic() {
        int copyCanadiate = canadiate;

        while(copyCanadiate > 0) {
            int mod = copyCanadiate % 10;
            copyCanadiate = copyCanadiate / 10;
            result = result + ( mod * mod * mod);
        }
    }

    /**
     * show result to user;
     */
    public void outPut() {
        if(canadiate == result) {
            System.out.println("armstrong number");
        } else {
            System.out.println(" not armstrong number");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber mArmstrongNumber = new ArmstrongNumber();
        mArmstrongNumber.input(153);
        mArmstrongNumber.logic();
        mArmstrongNumber.outPut();
    }

}

/**
 * Created by zhangjunxu on 1/9/18.
 */
public class FactorialNumber {
    private int input;
    private int result = 1;
    public void input(int input) {
        this.input = input;
    }

    public void logic() {
        for(int i = 1; i <= input; i++) {
            result *= i;
        }
    }

    public void outPut() {
        System.out.println("Factorial of "+input+" is: "+result);
    }

    public static void main(String[] args) {
        FactorialNumber mFactorialNumber = new FactorialNumber();
        mFactorialNumber.input(5);
        mFactorialNumber.logic();
        mFactorialNumber.outPut();
    }
}


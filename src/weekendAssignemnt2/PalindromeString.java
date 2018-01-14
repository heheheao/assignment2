package weekendAssignemnt2;

public class PalindromeString {
    private String mInputString;
    private Boolean mResult = true;

    public void input(String source) {
        this.mInputString = source;
    }

    public void logic() {
        int left = 0;
        int right = mInputString.length() - 1;
        while (left < right) {
            Character chLeft = mInputString.charAt(left);
            Character chRight = mInputString.charAt(right);
            if (!chLeft.equals(chRight)) {
                mResult = false;
                break;
            }
            left++;
            right--;
        }
    }

    public void outPut() {
        if (mResult) {
            System.out.println("the String is Palindrome");
        } else {
            System.out.println("this String is not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        palindromeString.input("abc");
        palindromeString.logic();
        palindromeString.outPut();
    }
}


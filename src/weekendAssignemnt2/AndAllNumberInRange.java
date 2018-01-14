package weekendAssignemnt2;

public class AndAllNumberInRange {
    private int start;
    private int end;
    private int result;

    /**
     * take user's input
     * @param start
     * @param end
     */
    public void input(int start,int end) {
       this.start = start;
       this.end = end;
    }

    /**
     * implements logic here
     */
    public void logic() {
        int offSet = 0;
        while(start != end) {
            start = start >> 1;
            end = end >> 1;
            offSet++;
        }

        result = start << offSet;
    }

    /**
     * show out put to user
     */
    public void outPut() {
        System.out.println("the result is: " + result);
    }

    public static void main(String[] args) {
        AndAllNumberInRange andAllNumberInRange = new AndAllNumberInRange();
        andAllNumberInRange.input(5, 7);
        andAllNumberInRange.logic();
        andAllNumberInRange.outPut();
    }
}

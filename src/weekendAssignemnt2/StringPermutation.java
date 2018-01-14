package weekendAssignemnt2;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    private String source;
    private List<String> result;

    public void input(String source) {
        this.source = source;
        result = new ArrayList<>();
    }

    public void logic() {
        backTracking(source, new StringBuilder());
    }

    public void outPut() {
        System.out.println(result);
    }

    private void backTracking(String source, StringBuilder sb) {
        if (source.length() == 0) {
            result.add(new String(sb.toString()));
        }
        int len = sb.length();
        for (int i = 0; i < source.length(); i++) {
            sb.append(source.charAt(i));
            backTracking(source.substring(0, i) + source.substring(i + 1), sb);
            sb.setLength(len);
        }
    }

    public static void main(String[] args) {
        StringPermutation stringPermutation = new StringPermutation();
        stringPermutation.input("abc");
        stringPermutation.logic();
        stringPermutation.outPut();
    }
}

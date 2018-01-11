package Jan10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangjunxu on 1/10/18.
 */
public class StringPermutation {
    private String source;
    private List<String> result;

    /**
     * take user input
     *
     * @param input
     */
    public void input(String input) {
        result = new ArrayList<>();
        source = input;
    }

    /**
     * call the logic function
     */
    public void logic() {
        backTracking(source, result, new StringBuilder());
    }

    /**
     * show result to user
     */
    public void outPut() {
        Collections.sort(result);
        System.out.println("result :" + result);
    }

    /**
     * Implements the full permutation logic in this backTracking funtion
     *
     * @param source is the input string
     * @param result is List of String data type, usr for store value after perimutation
     * @param sb     stringBuilder use for permutation, performance as a cache
     */
    private void backTracking(String source,
                              List<String> result, StringBuilder sb) {
        if (0 == source.length()) {
            if (!result.contains(sb.toString())) {
                result.add(new String(sb.toString()));
            }
            return;
        }

        int len = sb.length();
        for (int i = 0; i < source.length(); i++) {
            sb.append(source.charAt(i));
            backTracking(source.substring(0, i) + source.substring(i + 1, source.length()), result, sb);
            sb.setLength(len);
        }

    }

    public static void main(String[] args) {
        List<String> testSource;
        testSource = Arrays.asList("hat", "abc", "Zu6");
        StringPermutation mStringPermutation = new StringPermutation();

        for (String str : testSource) {
            mStringPermutation.input(str);
            mStringPermutation.logic();
            mStringPermutation.outPut();
        }
    }

}


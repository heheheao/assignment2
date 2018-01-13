package code;

import java.util.*;

/**
 * Created by zhangjunxu on 1/12/18.
 */
public class RemoveDupilcateArray {


    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,6,6,9};
        LinkedList<Integer> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i : nums) {
            if(result.isEmpty()) {
                result.add(i);
            } else if(result.peekLast() == i) {
                continue;
            } else {
                result.add(i);
            }
        }

        System.out.println(result);

        //Given int[] array,return number
        // with sum target for example
        // {1,2,7,8,9},target is 9,return(1,8),(2,7)

        int[] elements = {1, 2,7,8,9};
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        int target  = 9;
        for(int i = 0; i < elements.length; i++) {
            int diff = target - elements[i];

            if(map.containsKey(diff)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(elements[map.get(diff)]);
                pair.add(elements[i]);
                Collections.sort(pair);
                if(!ans.contains(pair)) {
                    ans.add(pair);
                }
            }
            map.put(elements[i], i);
        }
        System.out.println(ans);
    }
}

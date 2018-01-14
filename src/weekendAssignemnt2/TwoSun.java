package weekendAssignemnt2;

import java.util.*;

public class TwoSun {
    private List<Integer> nums = new ArrayList<>();
    private Set<Integer> set = new HashSet<>();

    /**
     * add the elements int ot nums
     * @param i
     */
    public void add(int i) {
        nums.add(i);
    }

    /**
     * give a target find a pair of the value in nums equal to target
     * @param target
     */
    public void find(int target) {
        if (set.contains(target)) {
            System.out.println("true");
        } else {
            Collections.sort(nums);
            Map<Integer, Integer> tmp = new HashMap<>();
            for (int i = 0; i < nums.size(); i++) {
                int diff = target - nums.get(i);
                if(tmp.containsKey(diff)) {
                    set.add(target);
                    System.out.println("true");
                    return;
                }
                tmp.put(nums.get(i), i);
            }
        }
        System.out.println("false");
    }

    public static void main(String[] args) {
        TwoSun twoSun = new TwoSun();
        for(int i = 0; i < 10; i++) {
            twoSun.add(i);
        }

        twoSun.find(33);
    }
}

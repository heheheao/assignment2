import java.util.*;

/**
 * Created by zhangjunxu on 1/12/18.
 */
public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Queue<String> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
        queue.add("A");
        queue.add("Z");
        queue.add("B");
        queue.add("X");
        System.out.println(queue.poll());


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

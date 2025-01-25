/* For reference: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html */

package Arrays.Lec_07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Vector: 100% growth - synchronised
        // ArrayList: 50% growth - non-synchronised

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        System.out.println(list.indexOf(30));

        System.out.println(list);
    }
}

package Linked_List.Lec_03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.reverse();
        var array  = list.toArray();
        System.out.println(Arrays.toString(array) + ", size = " + list.size());
        System.out.println(list.getKthFromTheEnd(0));
    }
}
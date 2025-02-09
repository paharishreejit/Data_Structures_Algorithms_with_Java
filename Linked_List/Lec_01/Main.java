/**************************
 * list.addLast()         *
 * list.addFirst()        *
 * list.removeFirst();    *
 * list.removeLast();     *
 * list.remove(int index) *
 * list.contains()        *
 * list.indexOf(Object o) *
 * list.size()            *
 * list.toArray()         *
 **************************/

package Linked_List.Lec_01;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(20)); // index of first occurrence of the object.
        System.out.println(list.size());
        System.out.println("Linked List: "  + list);
        var array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));
    }
}


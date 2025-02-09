package Linked_List.Lec_02;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            list.addLast(i);
        }
        list.print();
        list.addFirst(0);
        list.print();
        list.deleteLast();
        list.print();
        list.deleteFirst();
        list.print();
        System.out.println("Does the list contain 3 ?\nAns: " + list.contains(3));
    }
}

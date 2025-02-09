package Linked_List.Lec_02;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.setNextNode(head);
        head = newNode;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            addFirst(value);
            return;
        }

        Node currentNode = head;
        while (currentNode.getNextNode() != null)  {
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }

   public void deleteFirst() {
        head = head.getNextNode();
   }

   public void deleteLast() {
        Node currentNode = head;
        while (currentNode.getNextNode().getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(null);

   }

   public boolean contains(int value) {
        Node currentNode = head;
        while (currentNode.getNextNode() != null) {
            if (currentNode.getValue() == value)
                return true;
            currentNode = currentNode.getNextNode();
        }
        return false;
   }

   public int indexOf(int value) {
       Node currentNode = head;
       int index = 0;
       while (currentNode.getNextNode() != null) {
           if (currentNode.getValue() == value)
               return index;
           currentNode = currentNode.getNextNode();
           index++;
       }
       return -1;
   }

   public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " -> ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("NULL");
    }
}

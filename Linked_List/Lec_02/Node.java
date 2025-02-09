package Linked_List.Lec_02;

public class Node {
    private int value;
    private Node nextNode;

    public Node(int value) {
        this.value = value;
        nextNode = null;
    }

    public void setNextNode(Node newNode) {
        nextNode = newNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

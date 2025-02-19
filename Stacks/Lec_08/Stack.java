package Stacks.Lec_08;

import java.util.EmptyStackException;

public class Stack {
    private int[] items;
    private int index;
    private int size;

    public Stack() {
        size = 10;
        items = new int[size];
        index = 0;
    }

    public void push(int item) {
        if (index == size) resizeArray();
        items[index] = item;
        index++;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int item = items[index - 1];
        items[--index] = 0;

        return item;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();

        return items[index - 1];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public String toString() {
        StringBuffer string = new StringBuffer();

        string.append("[ ");
        for (int i = 0; i < index; i++) {
            string.append(items[i]);
            string.append(" ");
        }
        string.append("]");

        return string.toString();
    }

    private void resizeArray() {
        int[] temp = items;
        items = new int[size * 2];
        size *= 2;

        for (int i = 0; i < temp.length; i++) {
            items[i] = temp[i];
        }
    }
}

package Stacks.Lec_09;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private final int[] items = new int[5];
    private int count;

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();

        return items[--count];
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

}

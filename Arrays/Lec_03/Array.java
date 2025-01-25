package Arrays.Lec_03;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
        count = 0;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}

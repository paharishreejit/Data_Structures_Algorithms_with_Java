package Arrays.Lec_04;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
        count = 0;
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItem = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItem[i] = items[i];
            }

            items = newItem;
        }

        items[count++] = item;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

}

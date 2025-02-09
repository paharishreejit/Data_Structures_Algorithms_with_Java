package Arrays.Exercise;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
        count = 0;
    }

    private void adjustSize() {
        if (items.length == count) {
            int[] newItem = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItem[i] = items[i];
            }

            items = newItem;
        }
    }

    public void insert(int item) {
        adjustSize();
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        // O(n)
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }

        return -1;
    }

    public int max() {
        int max = items[0];
        for (int i = 0; i < count; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }

        return max;
    }

    public int[] intersect(int[] otherItems) {
        int[] intersection;
        int indexOfIntersection = 0;

        if (count < otherItems.length) {
            intersection = new int[count];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < otherItems.length; j++) {
                    if (otherItems[j] == items[i]) {
                        intersection[indexOfIntersection++] = items[i];
                    }
                }
            }
        } else {
            intersection = new int[otherItems.length];
            for (int i = 0; i < otherItems.length; i++) {
                for (int j = 0; j < count; j++) {
                    if (otherItems[i] == items[j]) {
                        intersection[indexOfIntersection++] = items[j];
                    }
                }
            }
        }

        return intersection;
    }

    public void reverse() {
        for (int i = 0; i < count; i++) {
            if (i == count - 1 - i) {
                break;
            }

            items[i] = items[i] + items[count - 1 - i];
            items[count - 1 - i] = items[i] - items[count - 1 - i];
            items[i] = items[i] - items[count - 1 - i];
        }
    }

    public void insertAt(int item, int index) {
        adjustSize();

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        count++;
        for (int i = count - 1; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = item;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            if (i == count - 1)
                System.out.print(items[i]);
            else
                System.out.printf("%d, ", items[i]);
        }
        System.out.println("]");
    }

}

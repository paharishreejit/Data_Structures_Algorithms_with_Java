/****************************
 * Author: SHREEJIT PAHARI  *
 ****************************/

package Arrays.Lec_02;

public class Array {
    private int[] arr;
    private byte index;

    public Array(int size) {
        arr = new int[size];
        index = 0;
    }

    public void insert(int number) {
        if (index + 1 > arr.length) {
            int[] temp = arr;
            arr = new int[arr.length * 2];
            for (int i = 0; i < temp.length; i++) {
                arr[i] = temp[i];
            }
        }

        arr[index++] = number;
    }

    public void removeAt(int index) {
        arr[index]  = 0;
        this.index--;
    }

    public int indexOf(int element) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == element)
                return index;
        }

        return -1;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}

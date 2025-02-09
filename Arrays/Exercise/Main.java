package Arrays.Exercise;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(40));
        numbers.print();
        System.out.printf("Max: %d\n", numbers.max());

        int[] otherNumbers = {1, 10, 3, 30};
        int[] intersection = numbers.intersect(otherNumbers);
        for (int i : intersection) {
            System.out.print(i + " ");
        }
        System.out.println("\n-----------------");
        numbers.reverse();
        numbers.print();

        numbers.insertAt(999, 1);
        numbers.print();
    }
}

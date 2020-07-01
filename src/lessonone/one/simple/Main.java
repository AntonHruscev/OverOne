package lessonone.one.simple;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{20, 1, 20, 2, 20, 20, 3, 20, 4, 20, 20}; // creating array wit 10 numbers
        int target = 20; // choosing number for remove

        for (int index : array) {
            System.out.print(index + " "); // print array
        }

        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] == target) || ((array[i] == target) && (array[i + 1] == target))) {
                array[i] = array[i + 1];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            } // change array

            System.out.println();

            for (int index : array) {
                System.out.print(index + " "); // print array
            } // show changed array

        }
    }
}

package sort1;
//Java. Сортировка пузырьком.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BubbleSort {

    public static void main(String[] args) {
        int [] array = new int [] {64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        printArray (array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }

                if (array[array.length-i] < array[array.length-i-1]) {
                    int temp = array[array.length-i];
                    array[array.length-i] = array[array.length-i-1];
                    array[array.length-i-1] = temp;
                    isSorted = false;
                }

            }
            printArray(array);

        }
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
    }
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }



}






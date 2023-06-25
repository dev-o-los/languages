package Java.Board_Programs;

public class Sortalgos {

    static int[] array = { 3, 2, 5, 4, 7, 1, 7, 8, 0 };

    public static void selectionsort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minindex]) {
                    minindex = j;
                }
            }
            int smallnum = array[minindex];
            array[minindex] = array[i];
            array[i] = smallnum;
        }
    }

    public static void selectionSortRecursion(int[] arr, int index) {
        if (index == arr.length - 1)
            return;
        int minIndex = index;
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[index];
        arr[index] = temp;
        selectionSortRecursion(arr, index + 1);
    }

    public static void bubblesort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortRecursive(int endIndex) {

        if (endIndex == 0) {
            // Base case: array is sorted
            return;
        }

        // Perform one pass of the bubble sort algorithm
        for (int i = 0; i < endIndex; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        // Recursively call bubbleSortRecursive with endIndex - 1
        bubbleSortRecursive(endIndex - 1);
    }

    public static void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        selectionSortRecursion(array, 0);
        display();
    }
}

package Java;

import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }

        long startTime = System.currentTimeMillis();

        NSort.quickmergeSort(arr, 0, arr.length - 1);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        long startTime2 = System.currentTimeMillis();

        Arrays.sort(arr);

        long endTime2 = System.currentTimeMillis();
        long elapsedTime2 = endTime2 - startTime2;

        System.out.println("Elapsed time: " + elapsedTime + "ms");

        System.out.println("Elapsed time: " + elapsedTime2 + "ms");

    }

}

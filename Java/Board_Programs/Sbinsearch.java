package Java.Board_Programs;

public class Sbinsearch {

    public static int binsrch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binsrch(arr, left, mid - 1, x);
            }
            return binsrch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 5, 6, 8, 9, 12, 14, 17, 89 };

        int index = binsrch(array, 0, array.length - 1, 12);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Element found at index " + (index + 1));
        }
    }

}

package Java.Board_Programs;

public class BinSearch {

    static int[] arr = { 8, 98, 6, 77, 76, 12, 24, 89, 99, 34, 7 };

    static void sort() {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - i - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int binsearch(int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binsearch(left, mid - 1, x);
            return binsearch(mid + 1, right, x);
        }
        return -1;
    }

    static int linearsrch(int x, int startpos) {

        if (x == arr[startpos]) {
            return startpos;
        } else if (startpos == arr.length - 1) {
            return -1;
        } else {
            return linearsrch(x, startpos + 1);
        }
    }

    public static void main(String[] args) {
        BinSearch.sort();
        int index = BinSearch.binsearch(0, arr.length - 1, 24);
        // int index = linearsrch(24, 0);
        if (index == -1) {
            System.out.println("element not found");
        } else {
            System.out.println(index + 1);
        }
    }

}

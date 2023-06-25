package Java.Board_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Admission {
    int[] adno;
    Scanner sc = new Scanner(System.in);

    Admission() {
        adno = new int[4];
    }

    void fillarray() {

        for (int i = 0; i < adno.length; i++) {
            System.out.println("Enter admission num");
            adno[i] = sc.nextInt();
        }
        Arrays.sort(adno);
    }

    int binsearch(int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (adno[mid] == x)
                return 1;
            if (adno[mid] > x)
                return binsearch(left, mid - 1, x);
            return binsearch(mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Admission ad = new Admission();
        ad.fillarray();
        int x = ad.sc.nextInt();
        int no = ad.binsearch(0, ad.adno.length - 1, x);
        if (no == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

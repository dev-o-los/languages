package Java;

import java.util.Arrays;

public class Test {

    static int trial(int n) {
        if (n == 1)
            return 2;
        else if (n == 2)
            return 3;
        else
            return trial(n - 2) + trial(n - 1);
    }

    static int find(int n, int p) {
        if (n == 0)
            return p;
        else {
            return find(p % n, n);
        }
    }

    static void numbers(int n) {
        if (n > 0) {
            System.out.print(n);
            numbers(n - 2);
            System.out.print(n);
        }
    }

    static int test(int c) {
        int a = 0;
        while (c != 0) {
            a++;
            c--;
        }
        // c--;
        return a;
    }

    static void test2() {
        int[] array = { 10, 30, 2, 3, 13, 15, 22, 19, 32, 23, 12 };
        int[] ar1 = new int[5];
        int[] ar2 = new int[array.length - ar1.length - 1];
        for (int i = 0; i < 5; i++) {
            ar1[i] = array[i];
        }
        for (int j = 0; j <= array.length; j++) {
            ar2[j] = array[j + 6];
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i]);
        }
        System.out.println(array[5]);
        for (int i = 6; i < ar2.length; i++) {
            System.out.println(ar2[i]);
        }
    }

    static void fun(int x, int y) {
        if (x > 1) {
            if (x % y == 0) {
                System.out.print(y + " ");
            }
            fun(x / y, y);
        } else {
            System.out.print(x);
        }
    }

    static void bitwiseand() {
        System.out.println(7 & 10);
    }

    public static void main(String[] args) {
        bitwiseand();
    }
}

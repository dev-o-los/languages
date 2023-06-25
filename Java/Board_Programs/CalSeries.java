package Java.Board_Programs;

import java.util.Scanner;

public class CalSeries {
    static int x = 0, n = 0, sum = 0;

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of (x) and (n)");
        x = sc.nextInt();
        n = sc.nextInt();
        sc.close();
    }

    static int power(int p, int q) {
        if (q == 0) {
            return 1;
        } else
            return p * power(p, q - 1);
    }

    static void call() {

        for (int i = 0; i <= n; i++) {
            sum = sum + power(x, i);
        }
        System.out.println("Answer " + sum);
    }

    public static void main(String[] args) {
        CalSeries.input();
        CalSeries.call();
    }

}

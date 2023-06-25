package Java.Board_Programs;

import java.util.Scanner;

public class Convert {
    static int n = 0, d = 0, m = 0, y = 0;

    static void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number and year");
        n = sc.nextInt();
        y = sc.nextInt();
        sc.close();
    }

    static void day_to_date() {
        int[] array = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (y % 4 == 0) {
            array[1] = 29;
        }
        while (n > array[m]) {
            n = n - array[m];
            m++;
        }
        d = n;
        m++;
    }

    static void display() {
        System.out.println("Day = " + d + " Year = " + y + " Month = " + m);
    }

    public static void main(String[] args) {
        Convert.accept();
        Convert.day_to_date();
        Convert.display();
    }
}

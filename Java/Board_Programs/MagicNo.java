package Java.Board_Programs;

import java.util.Scanner;

public class MagicNo {

    static boolean isMagic1(int num) {
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum = sum + last;
            num = num / 10;
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        if (sum == 1) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isMagic2(int num) {
        if (num % 9 == 1) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isMagic3(int num) {
        if ((num - 1) % 9 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        if (MagicNo.isMagic3(n)) {
            System.out.println("The number is magic number");
        } else {
            System.out.println("The number is not magic number");
        }
        sc.close();
    }
}

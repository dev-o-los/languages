package Java.Board_Programs;

import java.util.Scanner;

public class SmithNo {

    static int findsum(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + findsum(num / 10);
        }
    }

    static int sumofprimefactors(int num) {
        int sum = 0, org = num;
        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                sum += findsum(i);
                num /= i;
            }
        }
        if (num > 2) {
            if (num == org) {
                return 0;
            }
            sum += findsum(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        if (SmithNo.findsum(n) == SmithNo.sumofprimefactors(n)) {
            System.out.println(n + " is a smithno");
        } else {
            System.out.println(n + " is not a smithno");
        }
        sc.close();
    }

}

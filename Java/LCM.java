package Java;

import java.util.Scanner;

public class LCM {

    private static int lcm(int n1, int n2) {
        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);

        int lcm = max;
        while (lcm % min != 0) {
            lcm += max;
        }
        return lcm;
    }

    private static int gcd(int p, int q) {
        if (q == 0)
            return p;
        return gcd(q, p % q);
    }

    private static int lcm2(int n1, int n2) {
        return (n1 * n2) / gcd(n1, n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int n1 = sc.nextInt();
        System.out.println("Enter num1");
        int n2 = sc.nextInt();

        int lcm = lcm(n1, n2);
        int lcm2 = lcm2(n1, n2);
        int gcd = gcd(n1, n2);

        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm + " " + lcm2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
        sc.close();
    }
}

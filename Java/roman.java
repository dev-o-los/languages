package Java;

import java.util.Scanner;

public class roman {

    static int getValueOfRomanDigit(char value) {
        switch (value) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num in Roman");
        String n = sc.nextLine();
        sc.close();
        int total = 0;
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < n.length(); i++) {
            s1 = getValueOfRomanDigit(n.charAt(i));
            if (i + 1 < n.length()) {
                s2 = getValueOfRomanDigit(n.charAt(i + 1));
                if (s1 >= s2) {
                    total += s1;
                } else {
                    total -= s1;
                }
            } else {
                total += s1;
            }
        }
        System.out.println(total);
    }
}

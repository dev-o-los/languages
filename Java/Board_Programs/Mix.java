package Java.Board_Programs;

import java.util.Scanner;

public class Mix {

    static String a = "", b = "", c = "";

    static int getlength(String a, String b) {
        if (a.length() > b.length())
            return a.length();
        else
            return b.length();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word 1 and 2");
        String m = sc.nextLine().toUpperCase(), n = sc.nextLine().toUpperCase();
        if (m.length() < n.length()) {
            a = m;
            b = n;
        } else {
            a = n;
            b = m;
        }
        sc.close();
    }

    static void getword() {
        for (int i = 0; i <= Mix.getlength(a, b); i++) {
            if (i == a.length()) {
                c = c + b.substring(i);
                break;
            } else {
                c = c + a.charAt(i) + b.charAt(i);
            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        Mix.input();
        Mix.getword();
    }

}

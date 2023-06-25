package Java.Board_Programs;

import java.util.Scanner;

public class Stroniono {

    static void isStroniono(int num) {
        String numString = Integer.toString(num);
        if (numString.length() < 4) {
            System.out.println(numString + " is less than 4 digits , please re-enter");
        } else {
            String tempString = Integer.toString(num * 2);
            String subString = tempString.substring(1, 3);
            int finalnumber = Integer.parseInt(subString);
            if (finalnumber % 11 == 0) {
                System.out.println(num + " is Stronio number");
            } else {
                System.out.println(num + " is not Stronio number");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        Stroniono.isStroniono(input);
        sc.close();
    }

}

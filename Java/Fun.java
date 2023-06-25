package Java;

import java.util.Scanner;

public class Fun {

    private static char randomChar() {
        String set = " ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz";
        int random = (int) (Math.random() * set.length());
        return set.charAt(random);
    }

    private static void fun(String string) throws InterruptedException {
        char random;
        int counter = 0;
        String finalstring = "";

        for (int i = 0; i < string.length();) {
            random = Fun.randomChar();
            if (string.charAt(i) != random) {
                Thread.sleep(100);
                System.out.println(finalstring + random);
                counter++;
                continue;
            } else {
                i++;
                finalstring += random;
                System.out.println(finalstring);
            }
            if (finalstring.equalsIgnoreCase(string)) {
                System.out.println("Total count " + counter);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String string = sc.nextLine();
        fun(string);
        sc.close();
    }

}

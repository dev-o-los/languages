package Java.Board_Programs;

import java.util.Scanner;

public class Unique {
    static String word;
    static int len;

    Unique() {
        word = "";
        len = 0;
    }

    static void acceptword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        word = sc.nextLine().toUpperCase();
        len = word.length();
        sc.close();
    }

    static boolean checkUnique() {
        char[] array = { 'A', 'E', 'I', 'O', 'U' };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (word.charAt(0) == array[i] && word.charAt(len - 1) == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static void display() {
        if (checkUnique()) {
            System.out.println(word + " is Unique");
        } else {
            System.out.println(word + " is not Unique");
        }
    }

    public static void main(String[] args) {
        Unique.acceptword();
        Unique.checkUnique();
        Unique.display();
    }
}

package Java.Board_Programs;

import java.util.Scanner;

public class ConsChange {
    String word;
    int len;

    ConsChange() {
        word = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        word = sc.nextLine().toLowerCase();
        sc.close();
    }

    void shiftcons() {
        String cons = "", vow = "", fString = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                vow += word.charAt(i);
            } else {
                cons += word.charAt(i);
            }
        }
        fString = cons + vow;
        word = fString;
        System.out.println("Shifted word is : " + fString);
    }

    void changeword() {
        String forup = "", fString = "", restString = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o'
                    && word.charAt(i) != 'u') {
                forup += word.charAt(i);
            } else {
                restString = word.substring(i);
                break;
            }
        }
        fString = forup.toUpperCase() + restString;
        System.out.println("Changed word is : " + fString);
    }

    void show() {
        System.out.println("Original word is : " + word);
        System.out.println(word.length());
        shiftcons();
        changeword();
    }

    public static void main(String[] args) {
        ConsChange obj = new ConsChange();
        obj.readword();
        obj.show();

    }
}

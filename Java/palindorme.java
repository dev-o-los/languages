package Java;

public class palindorme {
    public static boolean isPalindrome(int num) {
        int org = num;
        int newnum = 0;
        while (num > 0) {
            newnum = newnum * 10 + num % 10;
            num = num / 10;
        }
        if (org == newnum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean b = isPalindrome(251);
        System.out.println(b);
    }
}

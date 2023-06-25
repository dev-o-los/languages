package Java.Board_Programs;

public class RevNo {
    static int num = 9876545;

    static void revno(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        } else {
            System.out.print((n % 10));
            revno(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.print("Reversed num: ");
        revno(num);
    }
}

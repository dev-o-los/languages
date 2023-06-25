package Java.Board_Programs;

public class Primefactors {

    static void primefactors(int n) {
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.println(n);
        }
    }

    static void primefactorsusingrecursion(int n, int i) {
        if (i < n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            primefactorsusingrecursion(n, i + 1);
        }
    }

    public static void main(String[] args) {
        primefactors(85);
        primefactorsusingrecursion(85, 2);
    }
}

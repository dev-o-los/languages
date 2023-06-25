package Java.Board_Programs;

public class fibonacci {

    public static void fib(int x, int y, int limit) {
        if (limit == 0) {
            return;
        }
        if (x == 0 && y == 1) {
            System.out.println(x);
            System.out.println(y);
        }
        int z = x + y;
        System.out.println(z);
        fib(y, z, limit - 1);
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        // fib(0, 1, 7);
        for (int i = 0; i < 7; i++) {
            System.out.println(fibo(i));
        }
    }
}

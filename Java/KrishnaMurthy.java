package Java;

public class KrishnaMurthy {

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

    public static void krishnaMurthynum(int num) {
        int org = num;
        int newnum = 0;
        while (num > 0) {
            newnum = newnum + fac(num % 10);
            num /= 10;
        }
        if (org == newnum) {
            System.out.println(org + " is a KrishnaMurthy Number");
        } else {
            System.out.println(org + " is not a KrishnaMurthy Number");
        }

    }

    public static void main(String[] args) {
        krishnaMurthynum(144);
    }
}

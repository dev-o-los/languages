package Java.Board_Programs;

public class GoldBach {

    static boolean isOddPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static void GoldBachno(int num) {
        int org = num;
        if (num % 2 != 0) {
            System.out.println("Invalid Input");
        } else if (num == 4 || num == 2) {
            System.out.println(org + " is not a GoldBach number");
        } else {
            for (int i = 1; i < num; i++) {
                if (((num - i) >= i) && GoldBach.isOddPrime(num - i) && GoldBach.isOddPrime(i)) {
                    System.out.println((num - i) + " " + i);
                }
            }
            System.out.println("Hence " + org + " is a GoldBach number");
        }
    }

    public static void main(String[] args) {
        GoldBach.GoldBachno(22);
    }

}

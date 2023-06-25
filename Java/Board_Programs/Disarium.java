package Java.Board_Programs;

public class Disarium {
    int num;
    int size;

    Disarium(int nn) {
        num = nn;
        size = 0;
    }

    void countDigit() {
        int c = 0;
        int temp = num;
        while (temp > 0) {
            c++;
            temp /= 10;
        }
        size = c;
    }

    int sumOfDigits(int n, int p) {
        return (n == 0) ? 0 : sumOfDigits(n / 10, p - 1) + (int) Math.pow(n % 10, p);
    }

    void check() {
        if (sumOfDigits(num, size) == num) {
            System.out.println(num + " is a diasarium number");
        } else {
            System.out.println(num + " is not a diasarium number");

        }
    }

    public static void main(String[] args) {
        Disarium obj = new Disarium(135);
        obj.countDigit();
        obj.check();
    }
}

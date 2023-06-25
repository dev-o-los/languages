package Java.Board_Programs;

public class Armstrong {

    int n;
    int sum = 0;

    Armstrong(int nn) {
        n = nn;
    }

    int sum_pow(int i) {
        if (i > 0) {
            return (int) Math.pow(i % 10, 3) + sum_pow(i / 10);
        } else {
            return 0;
        }
    }

    void isArmstrong() {
        int sum = sum_pow(n);
        if (sum == n) {
            System.out.println(n + " is Armstrong number");
        } else {
            System.out.println(n + " is not Armstrong number");
        }
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong(371);
        obj.isArmstrong();
    }

}

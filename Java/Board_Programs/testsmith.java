package Java.Board_Programs;

import java.lang.Math;

public class testsmith {
    public static void main(String[] args) {
        // Check if a number is a Smith number
        int n = 13;
        if (isSmithNumber(n)) {
            System.out.println(n + " is a Smith number");
        } else {
            System.out.println(n + " is not a Smith number");
        }
    }

    public static boolean isSmithNumber(int n) {
        // Return false if n is less than 2 or is a prime number
        if (n < 2 || isPrime(n)) {
            return false;
        }

        // Get the sum of the digits of n
        int sumOfDigits = getSumOfDigits(n);

        // Get the sum of the digits of the prime factorization of n
        int sumOfPrimeFactorization = getSumOfPrimeFactorization(n);

        // Return true if the sum of the digits of n is equal to the sum of the digits
        // of its prime factorization
        return sumOfDigits == sumOfPrimeFactorization;
    }

    public static int getSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int getSumOfPrimeFactorization(int n) {
        int sum = 0;
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                sum += getSumOfDigits(i);
                n /= i;
            }
        }
        if (n > 1) {
            sum += getSumOfDigits(n);
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

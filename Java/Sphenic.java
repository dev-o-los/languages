package Java;

import java.util.ArrayList;

public class Sphenic {

    public static ArrayList<Integer> primefactors(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            list.add(n);
        }
        return list;
    }

    public static void sphenic(int num) {
        ArrayList<Integer> list = primefactors(num);
        if (list.size() == 3 && list.stream().reduce(1, (a, b) -> a * b) == num) {
            System.out.println(num + " is a sphenic number");
        } else {
            System.out.println(num + " is not a sphenic number");
        }
    }

    public static void main(String[] args) {
        sphenic(79);
    }
}
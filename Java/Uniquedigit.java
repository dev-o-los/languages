package Java;

public class Uniquedigit {
    public static void uniquedigit(int m, int n) {
        if (m > n) {
            System.out.println("Invalid Range");
        } else {
            for (int i = m; i <= n; i++) {
                int c = 0;
                String num = Integer.toString(i);
                for (int j = 0; j < num.length(); j++) {
                    if (num.indexOf(num.charAt(j)) != num.lastIndexOf(num.charAt(j))) {
                        c++;
                    }
                }
                if (c == 0) {
                    System.out.println(num);
                }
            }

        }
    }

    public static void main(String[] args) {
        uniquedigit(2500, 2550);
        // String a = "hello";
        // System.out.println(a.indexOf('h'));
    }
}

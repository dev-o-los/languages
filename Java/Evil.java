package Java;

public class Evil {

    public static void evilno(int num) {
        String binum = Integer.toBinaryString(num);
        int c = 0;
        for (int i = 0; i < binum.length(); i++) {
            if (binum.charAt(i) == '1') {
                c++;
            }
        }
        if (c % 2 == 0) {
            System.out.println(num + " is a evil number");
        } else {
            System.out.println(num + " is not a evil number");
        }
    }

    public static void evilno2(int num) {
        String bin = "";
        while (num > 0) {
            bin = num % 2 + bin;
            num = num / 2;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        evilno(9);
    }
}

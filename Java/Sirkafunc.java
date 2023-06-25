package Java;

public class Sirkafunc {

    static int i = 15;

    static int m1() {
        return i--;
    }

    public static void main(String[] args) {
        for (m1(); m1() > 0; m1()) {
            System.out.println(i--);
        }
    }
}

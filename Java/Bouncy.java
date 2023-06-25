package Java;

import java.util.Arrays;

public class Bouncy {
    public static void bouncy(int num) {
        String num_to_str = Integer.toString(num);
        char[] array = num_to_str.toCharArray();
        Arrays.sort(array);
        StringBuffer sBuffer = new StringBuffer(String.valueOf(array));
        sBuffer.reverse();
        if (String.valueOf(array).equals(num_to_str) || num_to_str.equals(sBuffer.toString())) {
            System.out.println(num + " is bouncy number");
        } else {
            System.out.println(num + " is not bouncy number");
        }

    }

    public static void main(String[] args) {
        bouncy(97865);
    }
}

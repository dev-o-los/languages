package Java.Board_Programs;

public class Rearrange {

    public static void main(String[] args) {
        String wrd = "ORIGINAL";
        String wrd1 = "", temp = "";
        for (int i = 0; i < wrd.length(); i++) {
            if (wrd.charAt(i) == 'A' || wrd.charAt(i) == 'E' || wrd.charAt(i) == 'I' || wrd.charAt(i) == 'O'
                    || wrd.charAt(i) == 'U') {
                wrd1 = wrd1 + wrd.charAt(i);
            } else {
                temp = temp + wrd.charAt(i);
            }
        }
        wrd1 = wrd1 + temp;
        System.out.println(wrd1);
    }
}

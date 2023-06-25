package Java.Board_Programs;

public class Space {
    public static void main(String[] args) {
        String a = "Hello  world this is  fun";
        String[] b = a.split(" ");
        String c = "";
        for (int i = 0; i < b.length; i++) {
            if (!b[i].equals("")) {
                c = c + " " + b[i];
            }
        }
        System.out.println(c);
    }
}

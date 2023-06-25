package Java;

public class Call {

    int x;
    int y;

    static void swap(Call obj) {
        int temp;
        temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
    }

    public static void main(String[] args) {
        Call obj = new Call();
        obj.x = 10;
        obj.y = 20;
        System.out.println("Before swap" + "x = " + obj.x + " y = " + obj.y);
        swap(obj);
        System.out.println("After swap" + "x = " + obj.x + " y = " + obj.y);
    }

}

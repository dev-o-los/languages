package Java.Board_Programs;

public class Item {
    String name;
    int code;
    double amt;
    int uu;

    Item(String name, int code, double amt) {
        this.name = name;
        this.code = code;
        this.amt = amt;
    }

    void show() {
        System.out.println("Item name = " + name);
        System.out.println("Item code = " + code);
        System.out.println("Item amount = " + amt);
    }
}

class Taxable extends Item {

    double tax;
    double totalamt;

    Taxable(String name, int code, double amt) {
        super(name, code, amt);
    }

    void cal_tax() {
        tax = (amt * 10.2) / 100;
        totalamt = tax + amt;
    }

    void show() {
        super.show();
        System.out.println("Tax = " + tax);
        System.out.println("Total amount = " + totalamt);
    }

    public static void main(String[] args) {
        Taxable obj = new Taxable("Hello", 1010, 2200);
        obj.cal_tax();
        obj.show();
    }

}
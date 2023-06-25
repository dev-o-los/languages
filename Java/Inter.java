package Java;

interface i1 {

    // private abstract void add();
    public static final int a = 10;

    public abstract void show();

}

interface i2 {

    public abstract void show();

    // private abstract void add();

}

public class Inter implements i1, i2 {
    public void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Inter obj = new Inter();
        obj.show();
    }

}

package Java;

interface D1 {
    public void d1();
}

class A1 implements D1 {

    public void d1() {
        System.out.println("Drawing in A");
    }
}

class C {
    public static void main(String[] args) {
        A1 obja = new A1();
        obja.d1();
    }
}

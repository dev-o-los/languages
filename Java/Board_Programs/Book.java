package Java.Board_Programs;

public class Book {
    String[] name;
    int point, max;

    Book(int cap) {
        max = cap;
        name = new String[max];
        point = -1;
    }

    void tell() {
        if (point < 0) {
            System.out.println("SHELF EMPTY");
        } else {
            System.out.println(name[point]);
        }
    }

    void add(String v) {
        if (point < max - 1) {
            name[++point] = v;
        } else {
            System.out.println("SHELF FULL");
        }
    }

    void display() {
        for (int i = point; i >= 0; i--) {
            System.out.println(name[i]);
        }
    }

    public static void main(String[] args) {
        Book book = new Book(4);
        book.add("Merchant");
        book.add("hello");

        book.display();
    }
}

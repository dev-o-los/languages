package Java.Board_Programs;

import java.util.Scanner;

public class LL2 {

    static SNode head = null;

    public void createLL() {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            String data = sc.next();
            SNode node = new SNode(data);
            if (head == null) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
            System.out.println("enter 1 for more data");
            ch = sc.nextInt();
        } while (ch == 1);

        sc.close();
    }

    public void srch(String data) {
        SNode temp = head;
        while (!temp.data.equals(data)) {
            temp = temp.next;
            break;
        }
        if (temp.next == null && temp.data != data) {
            System.out.println("Not found");
        } else {
            System.out.println("Found");
        }

    }

    public void display() {
        SNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL2 l = new LL2();
        l.createLL();
        l.display();
        l.srch("d");
    }

}

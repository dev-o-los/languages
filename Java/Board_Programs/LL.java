package Java.Board_Programs;

import java.util.Scanner;

public class LL {

    Node1 head = null;

    public Node1 createLL() {
        Node1 node1 = null;
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter data");
            int data = sc.nextInt();
            Node1 node = new Node1(data);
            if (node1 == null) {
                node1 = node;
            } else {
                node.next = node1;
                node1 = node;
            }
            System.out.println("enter 1 for more data");
            ch = sc.nextInt();
        } while (ch == 1);
        sc.close();
        return node1;
    }

    public void insertatlast(int data) {
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node1 node = new Node1(data);
        temp.next = node;
    }

    public void insertfirst(int data) {
        Node1 node = new Node1(data);
        if (head != null) {
            node.next = head;
            head = node;
        }
    }

    public void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void insertmid(int data, int pos) {
        Node1 temp1 = head, temp2 = head.next;
        while (pos - 2 > 0) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;
        }
        Node1 node = new Node1(data);
        node.next = temp2;
        temp1.next = node;
    }

    public void mergelists(LL l) {
        Node1 part1 = l.createLL();
        Node1 part2 = l.createLL();
        Node1 temp = part1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = part2;
        part2 = null;

        Node1 temp2 = part1;
        while (temp2 != null) {
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }
    }

    public void splitlist(Node1 list, int pos) {
        Node1 temp = list;
        Node1 list1 = null, list2 = null;
        while (pos - 2 > 0) {
            temp = temp.next;
            pos--;
        }
        list2 = temp.next;
        temp.next = null;
        list1 = list;

        while (list1 != null) {
            System.out.println(list1.data);
            list1 = list1.next;
        }
        System.out.println("--------------------------");
        while (list2 != null) {
            System.out.println(list2.data);
            list2 = list2.next;
        }
    }

    public void swap(Node1 node, int pos) {
        Node1 temp1 = node, temp2 = node.next;
        while (pos - 2 > 0) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;
        }

        Node1 temp3 = new Node1(0);
        temp3.data = temp1.data;
        temp1.data = temp2.data;
        temp2.data = temp3.data;

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static void deleteend(Node1 node) {
        Node1 temp1 = node, temp2 = node.next;
        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = null;

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    static void deleteatpos(Node1 node, int pos) {
        Node1 temp1 = node, temp2 = node.next;
        while (pos - 2 > 0) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            pos--;
        }
        temp1.next = temp2.next;

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LL l = new LL();
        Node1 node = l.createLL();
        // deleteend(node);
        deleteatpos(node, 3);
    }

}

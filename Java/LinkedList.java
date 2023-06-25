package Java;

import java.util.Scanner;

public class LinkedList {

    static Node head = null;
    static Node shead = null;

    static void addNode() {
        int ch;
        Scanner sc = new Scanner(System.in);
        int data;
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            if (head == null) {
                Node node = new Node(data);
                head = node;
            } else {
                Node node = new Node(data);
                node.next = head;
                head = node;
            }
            System.out.println("MORE DATA? {input 1}");
            ch = sc.nextInt();
        } while (ch == 1);
        sc.close();
    }

    static Node addNodeformerging() {
        int ch;
        Scanner sc = new Scanner(System.in);
        int data;
        do {
            System.out.println("Enter data");
            data = sc.nextInt();
            if (head == null) {
                Node node = new Node(data);
                head = node;
            } else {
                Node node = new Node(data);
                node.next = head;
                head = node;
            }
            System.out.println("MORE DATA? {input 1}");
            ch = sc.nextInt();
        } while (ch == 1);
        sc.close();
        return head;
    }

    static void deleteNode(int data) {
        Node node = head;

        int counter = -1, pos = -1;
        while (node != null) {
            if (node.data == data) {
                pos = counter;
                break;
            } else {
                counter++;
                node = node.next;
            }
        }
        if (pos == -1) {
            head = head.next;
            return;
        }
        Node list = head;

        for (int i = 0; i < pos; i++) {
            list = list.next;
        }
        list.next = list.next.next;

    }

    static void sortList() {
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    static Node mergelist(Node list1, Node list2) {
        Node mNode = null;
        while (list1 != null) {
            list1 = list1.next;
        }
        mNode = list1 = list2;
        return mNode;
    }

    static void displayformergenode(Node list) {
        Node node = list;

        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print("NULL\n");
    }

    static void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print("NULL\n");
    }

    public static void main(String[] args) throws Exception {
        Node node1 = LinkedList.addNodeformerging();
        System.out.println("==========================");
        Node node2 = LinkedList.addNodeformerging();
        Node mergNode = LinkedList.mergelist(node1, node2);
        LinkedList.displayformergenode(mergNode);
        // App.display();
    }
}

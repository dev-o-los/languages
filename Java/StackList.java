package Java;

public class StackList {

    static Node head = null;
    static int top = -1;

    static void push(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            top = top + 1;
        } else {
            node.next = head;
            head = node;
            top = top + 1;
        }
    }

    static void pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            System.exit(0);
        } else {
            head = head.next;
            top--;
        }
    }

    static void display() {

        while (top >= 0) {
            System.out.println(head.data);
            head = head.next;
            top--;
        }
    }

    public static void main(String[] args) {
        StackList.push(10);
        StackList.push(20);
        StackList.push(30);
        StackList.push(40);
        StackList.push(50);
        StackList.pop();
        StackList.display();
    }
}

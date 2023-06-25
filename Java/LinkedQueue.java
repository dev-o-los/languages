package Java;

public class LinkedQueue {

    static Node front = null;
    static Node rear = null;

    static void enqueue(int x) {
        Node temp = new Node(x);
        if (rear == null) {
            rear = front = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    static void dequeue() {
        if (front != null) {
            int deletednode = front.data;
            front = front.next;
            System.out.println("Deleted " + deletednode);
        } else {
            System.out.println("Queue is empty");
        }
    }

    static void display() {
        Node node = front;
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print("NULL\n");
    }

    public static void main(String[] args) {
        LinkedQueue.enqueue(1);
        LinkedQueue.enqueue(2);
        LinkedQueue.enqueue(3);
        LinkedQueue.enqueue(4);
        LinkedQueue.enqueue(5);
        LinkedQueue.dequeue();
        LinkedQueue.dequeue();
        LinkedQueue.display();
    }
}

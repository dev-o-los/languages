package Java;

public class Queue {

    static int[] que = new int[10];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int x) {
        if (rear == que.length - 1) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front++;
            rear++;
            que[rear] = x;
        } else {
            rear++;
            que[rear] = x;
        }
    }

    static void dequeue() {
        if (rear == -1 && front == -1) {
            System.out.println("Queue is already empty");
        } else if (rear == front) {
            System.out.println("Deleted " + que[front]);
            front = -1;
            rear = -1;
        } else {
            System.out.println("Deleted " + que[front]);
            front++;
        }
    }

    static void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(que[i] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.dequeue();
        Queue.dequeue();
        Queue.display();
    }
}
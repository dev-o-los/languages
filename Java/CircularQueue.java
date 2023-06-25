package Java;

public class CircularQueue {

    static int front = -1;
    static int rear = -1;
    static int[] que = new int[5];

    static void enqueue(int x) {
        if (rear == que.length - 1 && front != 0) {
            rear = 0;
        } else if (rear == que.length - 1 || rear + 1 == front) {
            System.out.println("Overflow");
            System.exit(0);
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
        } else {
            rear++;
        }
        que[rear] = x;
    }

    static void dequeue() {
        if (rear == -1 && front == -1) {
            System.out.println("Queue is already empty");
            System.exit(0);
        } else if (rear == front) {
            front = rear = -1;
            System.out.println("Deleted " + que[front - 1]);
        } else {
            front++;
            System.out.println("Deleted " + que[front - 1]);
        }
    }

    static void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if (front > rear) {
            for (int i = front; i < que.length; i++) {
                System.out.print(que[i] + " | ");
            }
            for (int j = 0; j <= rear; j++) {
                System.out.print(que[j] + " | ");
            }
            System.out.println();
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(que[i] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue.enqueue(1);
        CircularQueue.enqueue(2);
        CircularQueue.enqueue(3);
        CircularQueue.enqueue(4);
        CircularQueue.enqueue(5);
        CircularQueue.dequeue();
        CircularQueue.enqueue(6);
        CircularQueue.dequeue();
        CircularQueue.enqueue(7);
        CircularQueue.display();
    }
}

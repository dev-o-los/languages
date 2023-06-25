package Java.Board_Programs;

public class Que {
    static int[] que = new int[10];
    static int front = -1, rear = -1;

    static void enqueue(int data) {
        if (rear == que.length - 1) {
            System.out.println("queue is full");
        } else if (rear == -1 && front == -1) {
            front++;
            rear++;
            que[rear] = data;
        } else {
            rear++;
            que[rear] = data;
        }
    }

    static void dequeue() {
        if (rear == -1 && front == -1) {
            System.out.println("que is empty");
        } else if (rear == front) {
            System.out.println("Deleted " + que[front]);
            front = rear = -1;
        } else {
            System.out.println("Deleted " + que[front]);
            front++;
        }
    }

    static void peek() {
        if (rear == -1 && front == -1) {
            System.out.println("Nothing to peek at");
        } else {
            System.out.println("Element at front is " + que[front]);
            System.out.println("Element at rear is " + que[rear]);
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
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();
        dequeue();
        dequeue();
        dequeue();
        display();
        peek();
    }
}

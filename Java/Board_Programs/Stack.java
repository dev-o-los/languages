package Java.Board_Programs;

public class Stack {
    static int[] stack = new int[10];
    static int top = -1;

    static void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack full");
        } else {
            stack[++top] = data;
        }
    }

    static int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        return stack[top--];
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Nothing to peek at");
        } else {
            System.out.println(stack[top]);
        }
    }

    static void display() {
        int temp = top;
        while (temp >= 0) {
            System.out.println(stack[temp]);
            temp--;
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        push(9);
        pop();
        pop();
        display();
        peek();
    }
}

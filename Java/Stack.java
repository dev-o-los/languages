package Java;

public class Stack {

    int[] stack = new int[10];
    int top = -1;

    void push(int data) {

        if (top == stack.length - 1) {
            System.out.println("Stack is full 😥");
        } else {
            stack[++top] = data;
        }

    }

    int[] pushtofirst(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full 😥");
            System.exit(0);
        }
        int[] dummystack = new int[10];
        dummystack[0] = data;
        top = top + 1;
        for (int i = 1; i <= top; i++) {
            dummystack[i] = stack[i - 1];
        }
        return stack = dummystack;

    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty 😑");
            System.exit(0);
        }
        return stack[top--];

    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("😁");
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.pushtofirst(89);
        s.display();
    }
}

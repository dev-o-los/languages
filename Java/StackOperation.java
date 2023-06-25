package Java;

class Stackop {

    static int[] stack = new int[10];
    static int top = -1;

    static boolean isEmpty() {
        return top == stack.length - 1;
    }

    void push(int data) {

        if (isEmpty()) {
            System.out.println("Stack is full 😥");
        }
        stack[++top] = data;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty 😑");
            return -1;
        }
        return stack[top--];

    }

    void pushbottom(int data) {
        if (top == -1) {
            push(data);
        } else {
            int value = pop();
            pushbottom(data);
            push(value);
        }
    }

    int peek() {
        if (isEmpty()) {
            System.exit(0);

        }
        // System.out.println(isEmpty());
        return stack[top];

    }

    void reverse() {
        int value = 0;
        if (top == -1) {
            return;
        } else {
            value = pop();
            reverse();
            pushbottom(value);
        }
    }

    public static void main(String[] args) {
        Stackop st = new Stackop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.reverse();
        while (!isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }

    }

}
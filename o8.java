class StackExample {
    int max = 5;
    int arr[] = new int[max];
    int top = -1;

    // Push operation
    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(arr[top] + " popped from stack");
            top--;
        }
    }

    // Peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }

    public static void main(String[] args) {
        StackExample s = new StackExample();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();

        s.pop();
        s.peek();
    }
}
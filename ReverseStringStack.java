public import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {

        String str = "HELLO";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        System.out.print("Reversed String: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
} {
    
}

class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
        left = right = null;
    }
}

public class PostorderTraversal {

    static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);   // Left
        postorder(root.right);  // Right
        System.out.print(root.data + " "); // Root
    }

    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');

        postorder(root);
    }
}
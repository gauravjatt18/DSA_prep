public class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
        left = right = null;
    }
}

public class InorderTraversal {

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);   // Left
        System.out.print(root.data + " "); // Root
        inorder(root.right);  // Right
    }

    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');

        inorder(root);
    }
} {
    
}

// Tree Node Definition
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PreorderTraversal {

    // Preorder Function
    public static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " "); // Visit root
        preorder(root.left);              // Traverse left
        preorder(root.right);             // Traverse right
    }

    public static void main(String[] args) {
        // Creating tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Preorder Traversal:");
        preorder(root);
    }
}
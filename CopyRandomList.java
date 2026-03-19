import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyRandomList {

    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // Step 1: Create copy of each node
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // Step 2: Assign next and random pointers
        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }

    // Test example
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);

        a.next = b;
        a.random = b;
        b.random = b;

        Node copied = copyRandomList(a);

        System.out.println(copied.val); // 1
        System.out.println(copied.random.val); // 2
    }
}
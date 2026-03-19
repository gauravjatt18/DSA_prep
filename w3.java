public import java.util.HashMap;

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

    static HashMap<Node, Node> map = new HashMap<>();

    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        // अगर पहले से copy बना है तो वही return करो
        if (map.containsKey(head)) {
            return map.get(head);
        }

        // नई node बनाओ
        Node copy = new Node(head.val);
        map.put(head, copy);

        // recursion से next और random assign करो
        copy.next = copyRandomList(head.next);
        copy.random = copyRandomList(head.random);

        return copy;
    }
} {
    
}

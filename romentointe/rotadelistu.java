class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}

class Solution {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head;

        k = k % length;
        int stepsToNewHead = length - k;

        ListNode newTail = temp;
        while (stepsToNewHead > 0) {
            newTail = newTail.next;
            stepsToNewHead--;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode result = rotateRight(head, k);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null || k == 0)
            return head;
        
        // Step 1: Find length
        ListNode current = head;
        int length = 1;
        
        while (current.next != null) {
            current = current.next;
            length++;
        }
        
        // Step 2: Make circular
        current.next = head;
        
        // Step 3: Adjust k
        k = k % length;
        
        // Step 4: Find new tail
        int stepsToNewTail = length - k;
        ListNode newTail = head;
        
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
        
        // Step 5: Break circle
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}
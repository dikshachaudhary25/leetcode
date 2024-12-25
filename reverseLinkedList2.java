class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        for (int i = 1; i < left; i++) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        ListNode LeftNode = prevNode;
        ListNode LastNode = currNode;
        ListNode nextNode = null;

        for (int i = 0; i < right - left + 1; i++) {
            nextNode = currNode.next; 
            currNode.next = prevNode; 
            prevNode = currNode;      
            currNode = nextNode;      
        }

        if (LeftNode != null) {
            LeftNode.next = prevNode; 
        } else {
            head = prevNode; 
        }

        LastNode.next = currNode; 

        return head;

    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        
        int delete = size - n;
        ListNode prevNode = head;
        int i = 1;
        if(n==size){
            return head.next;
        }
        while(i < delete){
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;
        return head;
    }
}

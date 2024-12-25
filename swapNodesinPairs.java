class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        prevNode.next = swapPairs(currNode.next);
        currNode.next = prevNode;
        return currNode;
        
    }
}

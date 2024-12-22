class Solution {

     public ListNode middle(ListNode head){
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        int mid = size/2;
        ListNode midNode = head;
        for (int i = 0; i < mid; i++) {
            midNode = midNode.next;
        }
        return midNode;    
    }

    public ListNode reverse(ListNode head){
        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
   
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode firsthalf = middle(head);
        ListNode secondhalfstart = reverse(firsthalf);
        ListNode firsthalfstart = head;
        while(secondhalfstart != null) {
        if(secondhalfstart.val != firsthalfstart.val) {
           return false;
        }
        firsthalfstart = firsthalfstart.next;
        secondhalfstart = secondhalfstart.next;
        }
        return true;
        
    }
    
}

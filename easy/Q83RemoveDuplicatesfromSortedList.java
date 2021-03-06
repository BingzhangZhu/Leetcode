package easy;

public class Q83RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null && p.next != null){
            if(p.val == p.next.val){
                p.next = p.next.next;
                p.next = null;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}

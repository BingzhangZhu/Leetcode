package easy;

public class Q141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        if(head == null || head.next == null){
            return false;
        } else {
            while (p2 != null && p2.next !=null){
                p1 = p1.next;
                p2 = p2.next.next;
                if(p1 == p2){
                    return true;
                }
            }
            return false;
        }
    }
}

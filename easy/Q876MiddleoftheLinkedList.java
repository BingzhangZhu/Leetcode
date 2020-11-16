package easy;
import java.util.*;

public class Q876MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(getCount(head)==1){
            return null;
        }
        ListNode p = head;
        //中间结点前一结点的指针
        for(int i=0; i < (int)Math.floor(getCount(head)/2)-1 ; i++){
            p = p.next;
        }
        ListNode new_p = p.next;
        p.next = null;
        new_p.next = null;
        return new_p;

    }

    //获得链表长度
    public int getCount(ListNode head)
    {
        ListNode temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
